package com.chero.common.pojo.dto;

import com.chero.common.pojo.enums.PushTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * Created by hxh on 2018/4/13.
 */
@Data
public class TempReportDTO extends ShareReportDTO{
    private String time;
    private Integer week;
}
