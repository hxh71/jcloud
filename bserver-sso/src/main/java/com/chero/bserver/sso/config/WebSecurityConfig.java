package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by hxh on 2018/5/8.
 */
@Configuration
// EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("hxh")  //
//                .password("hxh")
//                .roles("ADMIN");
        auth.userDetailsService(new UserServiceImpl()); // 使用自定义的用户认证
    }


    // isAuthenticated()       Returns true if the user is not anonymous
// isFullyAuthenticated()  Returns true if the user is not an anonymous or a remember-me user
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .httpBasic()
        .and()
            .antMatcher("/**").authorizeRequests().anyRequest().authenticated()
        .and()
            .authorizeRequests().antMatchers("/", "/anon").permitAll()
        .and()
            .csrf().disable();
    }
}
