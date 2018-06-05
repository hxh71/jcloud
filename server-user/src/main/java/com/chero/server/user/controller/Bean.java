package com.chero.server.user.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hxh on 2018/6/4.
 */
@Data
public class Bean {
//    @DateTimeFormat(pattern = "yyyy")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "SS")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
  //  请求的Content-Type需要是application/json
//    spring的controller的参数要用@RequestBody
//    @JsonDeserialize(using = JsonDate.Deserializer.class)
//    public void setDate(Date date) {
//        this.date = date;
//    }




//    public Date getDate() {
//        return date;
//    }

    //    public void setDate(String date){
//       this.date = new Date(Long.valueOf(date));
//    }

//    @JsonFormat(pattern = "yyyy")
//    public Date getDate(String date){
//       return this.date;
//    }
}
