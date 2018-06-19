package com.chero.server.user.domain;

import lombok.Data;

/**
 * Created by hxh on 2018/6/19.
 */
@Data
public class WrapCountDO {
    private Long l;
    private String d;

    public WrapCountDO(Long l, String d) {
        this.l = l;
        this.d = d;
    }
}
