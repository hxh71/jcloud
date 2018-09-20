package com.chero.server.user.repository;

import com.chero.server.user.domain.*;
import lombok.Data;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JpaTestRepository extends JpaRepository<JpaTestDO, String>, JpaSpecificationExecutor<UserDO> {


    @Query(value =
            "SELECT j.jpa_id, j.jpa_long, j.jpa_string, j.jpa_int, j.jpa_date " +
            "FROM jpa_test j " +
            "WHERE j.jpa_id = ?1 ",
            nativeQuery = true)
    Object[] findByProjection(String jpaId);
}