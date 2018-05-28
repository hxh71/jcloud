package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.pojo.dto.RoleDTO;
import com.chero.bserver.sso.model.pojo.dto.UserDTO;

/**
 * Created by hxh on 2018/5/23.
 */
public class RoleConverter extends CheroConverter<RolePO, RoleDTO>{


    @Override
    protected RoleDTO doForward(RolePO rolePO) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setRoleId(rolePO.getRoleId());
        roleDTO.setTitle(rolePO.getTitle());
        return roleDTO;
    }

    public static final RoleConverter INSTANCE = new RoleConverter(RolePO.class, RoleDTO.class);

    protected RoleConverter(Class<RolePO> clazzI, Class<RoleDTO> clazzO) {
        super(clazzI, clazzO);
    }
}
