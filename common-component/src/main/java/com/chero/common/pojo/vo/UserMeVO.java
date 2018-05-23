package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/10.
 */
@Data
public class UserMeVO {
    @JsonProperty("userId")
    private String id;
    @JsonProperty("mobile")
    private String username;
    @JsonProperty("isMain")
    private Boolean main;
    private Date updateTime;
}
