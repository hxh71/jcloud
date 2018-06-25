package com.chero.bserver.sso.model.repository;

import com.chero.bserver.sso.model.pojo.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by hxh on 2018/6/21.
 */
public interface RoleDao extends JpaRepository<RolePO, String>{
    @Query(value = "SELECT new RolePO(r.roleId, r.title) " +
            "FROM RolePO r, UserRolePO ur " +
            "WHERE r.roleId = ur.id.roleId " +
            "AND ur.id.userId = ?1")
    List<RolePO> findRolesByUserId(String userId);
}
