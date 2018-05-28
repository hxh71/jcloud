package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by hxh on 2018/5/11.
 */
@Configuration
@EnableResourceServer // 启动资源访问服务
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

//    @Autowired
//    private ResourceServerTokenServices myTokenService;


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint(((request, response, authException) ->
                        response.sendError(HttpServletResponse.SC_UNAUTHORIZED))) // 出任何问题显示位授权
                .and()
                .authorizeRequests().
                antMatchers("/test/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.tokenServices(myTokenService);  // 解析AccessToken的服务替换
//        resources.authenticationManager();
    }
}
