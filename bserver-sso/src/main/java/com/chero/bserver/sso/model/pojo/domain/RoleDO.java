package com.chero.bserver.sso.model.pojo.domain;

import lombok.Data;

/**
 * Created by hxh on 2018/5/11.
 * key = user、value = 用户信息， 如果没有信息返回null；
 * key = allRoles、 value
 */
@Data
public class RoleDO {
    private String roleId;

    private String title;
}
