package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.pojo.dto.RoleDTO;
import com.chero.bserver.sso.model.pojo.dto.UserDTO;
import com.chero.bserver.sso.model.service.impl.UserServiceImpl;
import com.chero.bserver.sso.util.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        // @formatter:on
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setTitle("a");
        roleDTO.setRoleId("位授权");
        http.csrf().disable()  // 跨域禁止
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)// session无状态
                .and()
                .exceptionHandling()
                .authenticationEntryPoint((request, response, authException) -> {
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED);// 出问题显示未授权
                    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                    response.setContentType("application/json;charset=UTF-8");
//              Map map = objectMapper.readValue(JsonUtil.toJson(token), LinkedHashMap.class);
                    response.getWriter().write(JsonUtil.toJson(roleDTO));
//                    response.
                }) // 出任何问题显示位授权
                .and()
                .requestMatchers().antMatchers("/**")       //不知道什么
                .and()
                .authorizeRequests()
                .antMatchers("/test/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic().disable(); // 如果disabled掉 则不能通过 http://用户名：密码@xxx.com登录

    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.tokenServices(myTokenService);  // 解析AccessToken的服务替换
//        resources.authenticationManager();
    }


}
