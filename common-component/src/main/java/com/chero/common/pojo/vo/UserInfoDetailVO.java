package com.chero.common.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by hxh44 on 2018/4/11.
 */
@Data
public class UserInfoDetailVO {
    private UserInfoVO mainRole;
    private List<UserInfoVO> subRoles;
}
