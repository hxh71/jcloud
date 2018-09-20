package com.chero.server.mybatis.domain;

import lombok.Data;

/**
 * Created by hxh on 2018/6/19.
 */
@Data
public class WrapCountDO {
    private Long l;
    private String d;
    private String[] s;

    public WrapCountDO(Long l, String d, String[] s) {
        this.l = l;
        this.d = d;
        this.s = s;
    }
}
