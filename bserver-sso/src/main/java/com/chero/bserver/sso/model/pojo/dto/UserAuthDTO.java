package com.chero.bserver.sso.model.pojo.dto;

import com.chero.bserver.sso.model.pojo.domain.UserPO;
import lombok.Data;

import java.util.List;

/**
 * Created by hxh on 2018/5/11.
 * key = user、value = 用户信息， 如果没有信息返回null；
 * key = allRoles、 value
 */
@Data
public class UserAuthDTO {
    private UserPO user;
    private List<String> roles;
}
