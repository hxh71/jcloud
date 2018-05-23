package com.chero.common.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by hxh44 on 2018/4/11.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像传地址
     */
    private String avatar;
    /**
     * 性别（0 女，1 男）
     */
    private Short gender;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    /**
     * 身高cm
     */
    private Integer height;
    /**
     * 体重kg
     */
    private Float weight;
    /**
     * 病史
     */
    private String medicalHistory;
}
