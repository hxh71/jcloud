package com.chero.common.pojo.domain;

import lombok.Data;

import java.util.Date;

/**
 * 用户表sys_user
 * Created by hxh on 2018/3/31.
 */
@Data
public class UserInfoDO extends BaseDO{

    private String id;
    /**
     * 关系圈下主用户id
     */
    private String mainUserId;
    /**
     * 登录用户id
     */
    private String userId;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像（地址）
     */
    private String avatar;
    /**
     * 性别（0，女，1，男）
     */
    private Short gender;
    /**
     * 出生日期
     */
    private Date birth;
    /**
     * 身高
     */
    private Integer height;
    /**
     * 体重
     */
    private float weight;
    /**
     * 病史
     */
    private String medicalHistory;
    /**
     * 权限
     */
    private String permission;

    /**
     *  (个推)客户端id
     */
    private String clientId;
}
