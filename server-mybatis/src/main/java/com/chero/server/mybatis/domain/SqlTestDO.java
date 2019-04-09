package com.chero.server.mybatis.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 2 * @Author: hxh
 * 3 * @Date: 2019/4/9 15:39
 * 4
 */
@Data
public class SqlTestDO {
    private String id;
    private String dVarchar;
    private Integer dTimestamp;
    private Long dBigInt;
    private LocalDateTime dDatetime;
    private LocalDate dDate;
    private Integer dTinyint;
    private Boolean dBit;
    private String dText;
    private String dBlob;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String createUser;
    private String updateUser;
    private Short deleted;
    private String remarks;
}
