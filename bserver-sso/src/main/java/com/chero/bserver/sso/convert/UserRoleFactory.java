package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.po.RolePO;
import com.chero.bserver.sso.model.pojo.po.UserPO;
import com.chero.bserver.sso.model.pojo.domain.RoleDO;
import com.chero.bserver.sso.model.pojo.domain.UserDO;

import java.util.List;
import java.util.Set;

/**
 * Created by hxh on 2018/5/28.
 */
public class UserRoleFactory {

    private UserRoleFactory() {
    }

    public static UserDO create(UserPO userPO, List<RolePO> list) {
        UserDO userDO = UserConverter.INSTANCE.convert(userPO);
        List<RoleDO> roleDOList =  RoleConverter.INSTANCE.convert(list);
        userDO.setRoles(roleDOList);
        return userDO;
    }
}
