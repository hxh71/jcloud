package com.chero.bserver.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.OAuth2AutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by hxh on 2018/4/4.
 */
@SpringBootApplication(scanBasePackages = {"com.chero"}, exclude = {RepositoryRestMvcAutoConfiguration.class})/*, OAuth2AutoConfiguration.class*/
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.chero.client.test"})
//@EnableJpaRepositories(basePackages = "com.chero.bserver.sso.model.repository")
public class SsoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class, args);
    }
}
