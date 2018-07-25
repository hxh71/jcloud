package com.chero.bserver.sso.model.repository;

import com.chero.bserver.sso.model.pojo.po.ClientPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author hxh
 * @date 2018/5/8
 */
public interface ClientDAO extends JpaRepository<ClientPO, Long> {

    ClientPO findByClientId(String clientId);

    @Transactional
    void deleteAllByIdIn(Long[] clientId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE ClientPO c SET c.remarks = ?2 WHERE c.clientId = ?1")
    void updateByClientId(String clientId, String remarks);

    @Transactional
    @Modifying
    @Query(value = "UPDATE ClientPO c SET c.remarks = ?2, c.clientSecret = ?3 WHERE c.clientId = ?1")
    void updateByClientId(String clientId, String remarks, String secrect);

//    @Query(value = "SELECT c.clientId, c.clientSecret, c.scope, c.locked, c.authorizedGrantTypes FROM ClientPO c WHERE c.clientId = ?1 AND c.deleted = 0")
//    @Query(value = "SELECT c.clientId, c.clientSecret, c.scope, c.locked, c.authorizedGrantTypes FROM ClientPO c WHERE c.clientId = ?1 ")
//    ClientAuthDO findClientAuthByClientId(String clientId);


}