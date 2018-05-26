package com.chero.bserver.sso.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.security.oauth2.OAuth2ClientProperties;

/**
 * Created by hxh on 2018/5/24.
 */
@Data
public class OAuth2Properties {
    /**
     * 使用jwt时为token签名的秘钥
     */
    private String jwtSigningKey;
}
