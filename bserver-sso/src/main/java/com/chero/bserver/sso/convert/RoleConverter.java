package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.po.RolePO;
import com.chero.bserver.sso.model.pojo.domain.RoleDO;

/**
 * Created by hxh on 2018/5/23.
 */
public class RoleConverter extends CheroConverter<RolePO, RoleDO>{


    @Override
    protected RoleDO doForward(RolePO rolePO) {
        RoleDO roleDO = new RoleDO();
        roleDO.setRoleId(rolePO.getRoleId());
        roleDO.setTitle(rolePO.getTitle());
        return roleDO;
    }

    public static final RoleConverter INSTANCE = new RoleConverter(RolePO.class, RoleDO.class);

    protected RoleConverter(Class<RolePO> clazzI, Class<RoleDO> clazzO) {
        super(clazzI, clazzO);
    }
}
