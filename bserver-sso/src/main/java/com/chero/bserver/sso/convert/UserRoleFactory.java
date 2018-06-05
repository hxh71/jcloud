package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.pojo.dto.RoleDTO;
import com.chero.bserver.sso.model.pojo.dto.UserDTO;

import java.util.List;
import java.util.Set;

/**
 * Created by hxh on 2018/5/28.
 */
public class UserRoleFactory {

    private UserRoleFactory() {
    }

    public static UserDTO create(UserPO userPO, List<RolePO> list) {
        UserDTO userDTO = UserConverter.INSTANCE.convert(userPO);
        List<RoleDTO> roleDTOList =  RoleConverter.INSTANCE.convert(list);
        userDTO.setRoles(roleDTOList);
        return userDTO;
    }
}
