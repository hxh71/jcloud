package com.chero.bserver.sso.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hxh on 2018/5/24.
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "jcloud.security")
public class CustomSecurityProperties {
    /**
     * OAuth2认证服务器配置
     */
    private OAuth2Properties oauth2 = new OAuth2Properties();
}
