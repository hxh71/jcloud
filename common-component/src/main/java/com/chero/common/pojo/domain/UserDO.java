package com.chero.common.pojo.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * 用户表sys_user
 * Created by hxh on 2018/3/31.
 */
@Data
public class UserDO extends BaseDO{

    private String id;
    /**
     * 用户名（手机号）
     */
    private String username;
    /**
     * 是否是该关系圈下的主账号
     */
    private Boolean main;
    /**
     * 密码
     */
    private String password;
    /**
     * vip等级
     */
    private Integer vipLevel;
    /**
     * 经验值
     */
    private Integer empiricalValue;
}
