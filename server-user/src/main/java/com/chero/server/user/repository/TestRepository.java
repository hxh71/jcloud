package com.chero.server.user.repository;
import com.chero.server.user.domain.TestDO;
import com.chero.server.user.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRepository extends JpaRepository<TestDO,String>,JpaSpecificationExecutor<UserDO> {
//    TestDO (String username);
}