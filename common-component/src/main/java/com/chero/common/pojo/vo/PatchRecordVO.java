package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/21.
 */
@Data
public class PatchRecordVO {
    private String id;
    @JsonProperty("roleId")
    private String userInfoId;
    private String pathchId;
    private String patchType;
    private String patchName;
    private Date updateTime;
    private Date createTime;
}
