package com.chero.common.pojo.enums;

import lombok.Getter;

/**
 * Created by hxh on 2018/4/14.
 */

@Getter
public enum PushTypeEnum {
    REPORT_ECG_LONG(1, "心电长程报告"),
    REPORT_ECG_SHORT(2, "心电短程报告"),
    REPORT_ECG_DAY(3, "心电短程报告"),
    REPORT_ECG_WEEK(4, "心电短程报告"),
    REPORT_ECG_MONTH(5, "心电月报告"),
    REPORT_TEMP_WEEK(6, "温度周报告"),
    REPORT_TEMP_MONTH(7, "温度月报告"),
    WARM_ECG(8, "心电报警"),
    WARN_TEMP(9, "温度报警"),
    ;

    private Integer code;
    private String message;
    PushTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
