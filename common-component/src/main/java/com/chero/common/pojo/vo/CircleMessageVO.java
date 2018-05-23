package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/17.
 */
@Data
public class CircleMessageVO {
//    private String id;
//    @JsonProperty("roleId")
//    private String userInfoId;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;
    //    @JsonProperty("otherRoleId")
//    private String toUserInfoId;
    private Integer readStatus;
    private Date updateTime;
}
