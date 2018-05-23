package com.chero.common.pojo.dto;

import com.chero.common.pojo.enums.PushTypeEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/4/12.
 */
@Data
public class EcgWarnDTO implements Serializable {

    private String roleId;
    // 疾病id集合
    private List<Integer> diseaseIds;
    // 疾病发生时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")

    private Date time;

    private String message;

    private Integer pushType;

    public Integer setPushType(PushTypeEnum pushTypeEnum) {
        return pushTypeEnum.getCode();
    }
}
