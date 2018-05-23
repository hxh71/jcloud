package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.convert.ClientConverter;
import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import com.chero.bserver.sso.model.pojo.dto.ClientDTO;
import com.chero.bserver.sso.model.repository.ClientDAO;
import com.chero.bserver.sso.model.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by hxh on 2018/5/8.
 */
@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;



    @Override
    public ClientDTO getByClientId(String clientId) {
        ClientPO clientPO = clientDAO.findByClientId(clientId);
        if (clientPO != null) {
            return ClientConverter.INSTANCE.convert(clientPO);
        } else {
            return null;
        }
    }

    /**
     * 根基客户端编号（client_id)查询出客户的信息以及对应的授权内容
     * @param clientId 客户端id
     * @return 返回的数据包含有如下内容；
     * key = client、value = Client的对象，如果不存在则用null;
     * key = allAuthorities、value = 当Client信息存在时获取授权内容;
     */
//    @Override
//    public ClientAuthDTO get(String clientId) {
//        ClientAuthDTO clientAuthDTO = new ClientAuthDTO();
//        ClientPO client = this.clientDAO.findByClientId(clientId);
//        if (client != null) {
//            clientAuthDTO.setAllAuthorities(clientAuthoritiesDAO.findAuthoIdByIdClientId(clientId));
//        }
//        clientAuthDTO.setClient(client);
//        return clientAuthDTO;
//    }



    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        ClientPO client = this.clientDAO.findByClientId(clientId);
        log.info("客户id={}", clientId);
        if (client == null) { // 没有查询客户信息
            throw new ClientRegistrationException("客户" + clientId + "的信息不存在，无法进行OAuth认证处理");
        }
        ClientPO clientPO = clientDAO.findByClientId(clientId);
        ClientDTO clientDTO = ClientConverter.INSTANCE.convert(clientPO);
        return clientDTO;
    }
}
