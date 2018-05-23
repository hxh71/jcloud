package com.chero.bserver.sso.model.repository;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserRolePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

/**
 * Created by hxh on 2018/5/8.
 */
public interface UserRoleDAO extends JpaRepository<UserRolePO, String> {
    @Query(value = "SELECT role_id FROM db_user_role WHERE user_id = ?1",
            nativeQuery = true)
    List<String> findRoleIdByIdUserId(String userId);

    @Query(value = "SELECT new com.chero.bserver.sso.model.pojo.domain.RolePO(r.roleId, r.title) FROM RolePO r, UserRolePO ur " +
            "WHERE r.roleId = ur.roleId AND ur.userId = ?1")
    Set<RolePO> findRoleByUserId(String userId);
}