package com.chero.common.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by hxh44 on 2018/4/11.
 */
@Data
public class SettingDTO {

    // 总开关
    private Boolean mainStartup;

    // 心电开关设置
    private Boolean ecgWarnStartup;
    private String ecgWarnStartupDetail;
    private String ecgWarnReceiveIds;
    private String ecgReportReceiveIds;

    // 温度开关设置
    private Boolean tmpWarnStartup;
    private String tmpWarnStartupDetail;
    private String tmpWarnReceiveIds;
    private String tmpReportReceiveIds;

    // 呼吸睡眠开关设置
}
