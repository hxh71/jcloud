package com.chero.server.user.repository;


import com.chero.server.user.domain.SqlTestDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlTestRepository extends JpaRepository<SqlTestDO, String> {

}
