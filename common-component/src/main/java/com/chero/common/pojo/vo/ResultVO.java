package com.chero.common.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * Created by 廖师兄
 * 2017-12-09 22:09
 */
@Data
public class ResultVO<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer status;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体内容
     */
    private T content;

    /**
     * 分页信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageVO page;

}
