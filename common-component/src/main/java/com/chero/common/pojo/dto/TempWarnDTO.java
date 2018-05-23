package com.chero.common.pojo.dto;

import com.chero.common.pojo.enums.PushTypeEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by hxh on 2018/4/12.
 */
@Data
public class TempWarnDTO {
    private String roleId;
    private Float temp;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date time;
    private String message;
    private Integer pushType;

    public Integer setPushType(PushTypeEnum pushTypeEnum) {
        return pushTypeEnum.getCode();
    }
}
