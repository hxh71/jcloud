package com.chero.bserver.sso.model.repository;

import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hxh on 2018/5/8.
 */
public interface ClientDAO extends JpaRepository<ClientPO, String> {
    ClientPO findByClientId(String clientId);
//    @Query(value = "SELECT c.clientId, c.clientSecret, c.scope, c.locked, c.authorizedGrantTypes FROM ClientPO c WHERE c.clientId = ?1 AND c.deleted = 0")
//    @Query(value = "SELECT c.clientId, c.clientSecret, c.scope, c.locked, c.authorizedGrantTypes FROM ClientPO c WHERE c.clientId = ?1 ")
//    ClientAuthDO findClientAuthByClientId(String clientId);



}