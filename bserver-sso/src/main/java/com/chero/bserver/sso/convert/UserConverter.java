package com.chero.bserver.sso.convert;

import com.chero.bserver.sso.model.pojo.domain.ClientPO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import com.chero.bserver.sso.model.pojo.dto.ClientDTO;
import com.chero.bserver.sso.model.pojo.dto.UserDTO;

/**
 * Created by hxh on 2018/5/23.
 */
public class UserConverter extends CheroConverter<UserPO, UserDTO>{


    protected UserConverter(Class<UserPO> clazzI, Class<UserDTO> clazzO) {
        super(clazzI, clazzO);
    }

    @Override
    protected UserDTO doForward(UserPO userPO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userPO.getUserId());
        userDTO.setLocked(userPO.getLocked());
        userDTO.setMobile(userPO.getMobile());
        userDTO.setPassword(userPO.getPassword());
        userDTO.setLastUpdateMobile(userPO.getLastUpdateMobile());
        userDTO.setLastUpdatePassword(userPO.getLastUpdatePassword());
        return super.doForward(userPO);
    }

    public static final UserConverter INSTANCE = new UserConverter(UserPO.class, UserDTO.class);
}
