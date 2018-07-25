package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.convert.ClientConverter;
import com.chero.bserver.sso.model.pojo.domain.ClientDO;
import com.chero.bserver.sso.model.pojo.po.ClientPO;
import com.chero.bserver.sso.model.repository.ClientDAO;
import com.chero.bserver.sso.model.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

/**
 * Created by hxh on 2018/5/8.
 */
@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        ClientPO client = this.clientDAO.findByClientId(clientId);
        log.info("客户id={}", clientId);
        if (client == null) { // 没有查询客户信息
            throw new ClientRegistrationException("客户" + clientId + "的信息不存在，无法进行OAuth认证处理");
        }
        ClientPO clientPO = clientDAO.findByClientId(clientId);
        ClientDO clientDO = ClientConverter.INSTANCE.convert(clientPO);
        return clientDO;
    }
}
