package com.chero.bserver.sso.model.pojo.dto;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by hxh on 2018/5/11.
 * key = user、value = 用户信息， 如果没有信息返回null；
 * key = allRoles、 value
 */
@Data
public class RoleDTO {
    private String roleId;

    private String title;
}
