package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.pojo.domain.RoleDO;
import com.chero.bserver.sso.util.JsonUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

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
        // @formatter:on
        RoleDO roleDO = new RoleDO();
        roleDO.setTitle("a");
        roleDO.setRoleId("位授权");
        http.csrf().disable()  // 跨域禁止
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)// session无状态
                .and()
                .exceptionHandling()
                .authenticationEntryPoint((request, response, authException) -> {
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED);// 出问题显示未授权
                    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                    response.setContentType("application/json;charset=UTF-8");
//              Map map = objectMapper.readValue(JsonUtil.toJson(token), LinkedHashMap.class);
                    response.getWriter().write(JsonUtil.toJson(roleDO));
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
