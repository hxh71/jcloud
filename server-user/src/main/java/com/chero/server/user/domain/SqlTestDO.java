package com.chero.server.user.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 2 * @Author: hxh
 * 3 * @Date: 2019/4/9 15:39
 * 4
 */
@Data
@Entity
@Table(name = "sql_test")
@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
public class SqlTestDO {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String dVarchar;
    private Date dTimestamp;
    private Long dBigint;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime dDatetime;
    private LocalDate dDate;
    private Integer dTinyint;
    private Boolean dBit;
    private String dText;
    private String dBlob;
    @CreatedDate
    private LocalDateTime createTime;
    @LastModifiedDate
    private LocalDateTime updateTime;
    @CreatedBy
    private String createUser;
    @LastModifiedBy
    private String updateUser;
    private Short deleted = 0;
    private String remarks;
}
