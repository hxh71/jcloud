package com.chero.server.user.repository;

import com.chero.server.user.domain.JpaProjection;
import com.chero.server.user.domain.JpaTestDO;
import com.chero.server.user.domain.UserDO;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class JpaTestDAO {

    @Autowired
    private EntityManager em;

    public Object getJpaTestProjection(String id){
        String sql = "SELECT j.jpa_id, j.jpa_long, j.jpa_string, j.jpa_int, j.jpa_date " +
                "FROM jpa_test j " +
                "WHERE j.jpa_id = ?1 ";
        Query q = em.createNativeQuery(sql)
                .setParameter(1, id);
//                .unwrap(org.hibernate.query.Query.class)
//                .setResultTransformer(Transformers.aliasToBean(JpaProjection.class));
//        em.createQuery() // jpql
        return  q.getSingleResult();
    }
}