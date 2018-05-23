//package com.chero.bserver.sso.model.repository;
//
//import com.chero.bserver.sso.model.pojo.domain.AuthoritiesPO;
//import com.chero.bserver.sso.model.pojo.domain.ClientAuthoritiesPO;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//import java.util.Set;
//
//
///**
// * Created by hxh on 2018/5/8.
// */
//public interface ClientAuthoritiesDAO extends JpaRepository<ClientAuthoritiesPO, String> {
//    @Query(value = "SELECT autho_id FROM db_client_authorities WHERE client_id = ?1 AND deleted = 0",
//            nativeQuery = true)
//    List<String> findAuthoIdByIdClientId(String clientId);
//
//
//
//    @Query(value = "SELECT new com.chero.bserver.sso.model.pojo.domain.AuthoritiesPO(a.authoId , a.title) FROM AuthoritiesPO a, ClientAuthoritiesPO ca " +
//            "WHERE a.authoId = ca.authoId AND ca.clientId = ?1")
//    Set<AuthoritiesPO> findAuthoritiesByClientId(String clientId);
//}