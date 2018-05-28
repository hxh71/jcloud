package com.chero.bserver.sso.enhancer;

import com.chero.bserver.sso.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hxh on 2018/5/25.
 */
public class TokenJwtEnhancer implements org.springframework.security.oauth2.provider.token.TokenEnhancer {

/* (non-Javadoc)
 * @see org.springframework.com.chero.server.sleep.security.oauth2.provider.token.TokenEnhancer#enhance(org.springframework.com.chero.server.sleep.security.oauth2.common.OAuth2AccessToken, org.springframework.com.chero.server.sleep.security.oauth2.provider.OAuth2Authentication)
 */

    @Autowired
    private UserService userService;

//    @Autowired
//    private UserInfoService userInfoService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        Map<String, Object> info = new HashMap<>();
        info.put("company", "chero");

        String mobile = authentication.getName();
//        String userId = String.valueOf(userService.loadUserByUsername(mobile));
//        UserInfoDO userInfoDO = userInfoService.findMainByUserId(userId);

//        info.put("userId", userId);
        info.put("status", new Integer(0));
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        return accessToken;
    }
}
