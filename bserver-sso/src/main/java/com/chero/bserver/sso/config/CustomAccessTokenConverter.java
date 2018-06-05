//package com.chero.bserver.sso.config;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.OAuth2Request;
//import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
//
//import java.util.*;
//
///**
// * Created by hxh on 2018/5/29.
// */
//public class CustomAccessTokenConverter extends DefaultAccessTokenConverter{
//    @Override
//    public Map<String, ?> convertAccessToken(OAuth2AccessToken token, OAuth2Authentication authentication) {
//        Map<String, Object> response = (Map<String, Object>) super.convertAccessToken(token, authentication);
//        OAuth2Request clientToken = authentication.getOAuth2Request();
//        response.put("clientAuthorities", clientToken.getAuthorities());
//        return response;
//    }
//
//    @Override
//    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
////        Collection<HashMap<String, String>> clientAuthorities = (Collection<HashMap<String, String>>) map.get("client_authority");
////
////        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
////
////        for (HashMap<String, String> grantedAuthority : clientAuthorities) {
////            for (String authority : grantedAuthority.values()) {
////                grantedAuthorities.add(new SimpleGrantedAuthority(authority));
////            }
////        }
////
////        Set<String> resourceIds = new LinkedHashSet<String>(map.containsKey(AUD) ? (Collection<String>) map.get(AUD) : Collections.<String> emptySet());
////        OAuth2Request request = new OAuth2Request(parameters, clientId, grantedAuthorities, true, scope, resourceIds, null, null, null);
////        return super.extractAuthentication(map);
//    }
//}
