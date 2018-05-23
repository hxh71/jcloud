package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/10.
 */
@Data
public class UserInfoVO extends UserInfoSimpleVO {

    private Short gender;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date birth;
    private Integer height;
    private Float weight;
    private String mobile;
    private String medicalHistory;
    private Date updateTime;
}
