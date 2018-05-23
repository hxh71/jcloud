package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh44 on 2018/4/11.
 */
@Data
public class UserInfoSimpleVO {
    @JsonProperty("roleId")
    private String id;
    private String userId;
    private String mainUserId;
    @JsonProperty("isMainRole")
    private Boolean mainRole;
    @JsonProperty("isMain")
    private Boolean main;
    private String nickname;
    private String avatar;
    private String clientId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer unreadCount;
    private Date updateTime;
}
