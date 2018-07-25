package com.chero.bserver.sso.config;


import com.chero.bserver.sso.model.service.UserService;
import com.chero.bserver.sso.model.service.ClientService;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hxh
 * @date 2018/4/2
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{

    /**
     * 注入authenticationManager
     * 来支持 password grant type
     */


    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private ClientService clientService;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientService);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()");  // /oauth/token_key 输入client信息从这个接口中获取  如果不设置默认是denyAll()为关闭
                                                // {"alg": "HMACSHA256",
                                                // "value": "JwtChero"}
        security.tokenKeyAccess("isAuthenticated()");
//        security.
        // 我要访问我的认证服务器tokenkey时 需要身份认证
//        security.tokenKeyAccess("isAuthenticated()");
    }

    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired(required = false)
    private JwtAccessTokenConverter jwtAccessTokenConverter;

    @Autowired(required = false)
    private TokenEnhancer jwtTokenEnhancer;
    @Autowired
    private TokenStore tokenStore;
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        if (authenticationManager instanceof OAuth2AuthenticationManager) {
            System.out.println(true);
        }
        endpoints
                .authenticationManager(authenticationManager)
                .tokenStore(tokenStore)
                .userDetailsService(userService)
                .setClientDetailsService(clientService);
                /**/
//                .tokenServices();  // 这个不加 在使用 refresh_token时会报错找不到UserDetailService
        if (jwtAccessTokenConverter != null && jwtTokenEnhancer != null) {
            TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
            List<TokenEnhancer> enhancers = new ArrayList<>();
            enhancers.add(jwtTokenEnhancer);
            enhancers.add(jwtAccessTokenConverter);
            enhancerChain.setTokenEnhancers(enhancers);
            endpoints.tokenEnhancer(enhancerChain).accessTokenConverter(jwtAccessTokenConverter);
        }
    }




}
