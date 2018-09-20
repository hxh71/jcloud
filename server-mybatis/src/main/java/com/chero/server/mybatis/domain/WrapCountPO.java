package com.chero.server.mybatis.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;


/**
 * Created by hxh on 2018/6/19.
 */
@Data
@TableName("wrap_count")
public class WrapCountPO {
    @TableId
    private Long id;
    private Long l;
    private String d;

    public WrapCountPO(Long l, String d) {
        this.l = l;
        this.d = d;
    }
}
