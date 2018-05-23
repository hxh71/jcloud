package com.chero.common.pojo.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by hxh on 2018/4/21.
 */
@Data
public class PatchRecordForm {
    @JsonProperty("roleId")
    private String userInfoId;
    private String pathchId;
    private String patchType;
    private String patchName;
}
