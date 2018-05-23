package com.chero.common.pojo.dto;

import com.chero.common.pojo.enums.PushTypeEnum;
import lombok.Data;

/**
 * Created by hxh on 2018/4/21.
 */
@Data
public class ShareReportDTO{
    // 角色id
    private String roleId;
    // 报告id
    private String reportId;
    // 推送类型
    private Integer pushType;
    // 推送消息
    private String message;
    public Integer setPushType(PushTypeEnum pushTypeEnum) {
        return pushTypeEnum.getCode();
    }
}
