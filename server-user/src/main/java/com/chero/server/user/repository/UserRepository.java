package com.chero.server.user.repository;
import com.chero.server.user.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface UserRepository extends JpaRepository<UserDO,String>,JpaSpecificationExecutor<UserDO> {
    UserDO findByUsername(String username);
}