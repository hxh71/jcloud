//package com.chero.bserver.sso.service;
//
//import com.chero.bserver.sso.model.pojo.domain.ClientPO;
//import com.chero.bserver.sso.model.pojo.dto.ClientAuthDTO;
//import com.chero.bserver.sso.model.service.ClientService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.ClientRegistrationException;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//
//import java.util.*;
//
//@Slf4j
//public class ClientDetailsServiceImpl implements ClientDetailsService {
//
//    @Autowired
//    private ClientService clientService;
//
//    @Override
//    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
//        ClientAuthDTO clientAuthDTO = clientService.get(clientId);
//        log.info("【clientId是什么】={}", clientId);
//
//        if (clientAuthDTO.getClient() == null) { // 没有查询客户信息
//            throw new ClientRegistrationException("客户" + clientId + "的信息不存在，无法进行OAuth认证处理");
//        }
//        ClientPO client = clientAuthDTO.getClient(); // 获取客户信息，将其进行填充
//
//        BaseClientDetails clientDetails = new BaseClientDetails();
//        clientDetails.setClientId(clientId);
//        clientDetails.setClientSecret(client.getClientSecret());
//        clientDetails.setAuthorizedGrantTypes(Arrays.asList(client.getAuthorizedGrantTypes()));
//        clientDetails.setScope(Arrays.asList(client.getScope()));
//        clientDetails.setAutoApproveScopes(clientDetails.getScope());
//        // 接受所有的授权信息
//        List<String> auth = clientAuthDTO.getAllAuthorities();
//        List<GrantedAuthority> allGrantedAuthority = new ArrayList<>();
//        Iterator<String> iter = auth.iterator();
//        while (iter.hasNext()) {
//            allGrantedAuthority.add(new SimpleGrantedAuthority(iter.next()));
//        }
//        clientDetails.setAuthorities(allGrantedAuthority);
//        clientDetails.setAccessTokenValiditySeconds(999999);
//        return clientDetails;
//    }
//}