package com.chero.common.pojo.dto;

import com.chero.common.pojo.enums.PushTypeEnum;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/4/12.
 */
@Data
public class EcgReportDTO extends ShareReportDTO{

    // 疾病发生时间
    private String time;

    // 个推客户端id
    private String clientId;

}
