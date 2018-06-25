package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.po.UserPO;
import com.chero.bserver.sso.model.pojo.domain.UserDO;

/**
 * Created by hxh on 2018/5/23.
 */
public class UserConverter extends CheroConverter<UserPO, UserDO>{


    protected UserConverter(Class<UserPO> clazzI, Class<UserDO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected UserDO doForward(UserPO userPO) {
        UserDO userDO = new UserDO();
        userDO.setUserId(userPO.getUserId());
        userDO.setEnabled(userPO.getEnabled());
        userDO.setMobile(userPO.getMobile());
        userDO.setPassword(userPO.getPassword());
        userDO.setLastUpdateMobile(userPO.getLastUpdateMobile());
        userDO.setLastUpdatePassword(userPO.getLastUpdatePassword());
        return super.doForward(userPO);
    }

    public static final UserConverter INSTANCE = new UserConverter(UserPO.class, UserDO.class);
}
