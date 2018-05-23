package com.chero.common.pojo.enums;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hxh on 2018/4/21.
 */
@Getter
public enum  ReportLinkTypeEnum {
    ECG_SHORT_LINK(0, "短程心电报告"),
    ECG_lONG_LINK(1, "长程心电报告"),
    TEMP_WEEK_LINK(2, "温度周报告"),
    TEMP_MONTH_LINK(3, "温度月报告链接"),
            ;

    private Integer code;
    private String message;
    ReportLinkTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
