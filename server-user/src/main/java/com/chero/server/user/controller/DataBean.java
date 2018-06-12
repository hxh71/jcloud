package com.chero.server.user.controller;

import com.chero.server.user.annotation.TimestampFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/6/4.
 */
@Data
public class DataBean {
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @TimestampFormat
    private Date[] data;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @TimestampFormat
    private List<Date> data1;
}
