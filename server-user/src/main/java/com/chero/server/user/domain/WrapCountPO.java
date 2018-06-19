package com.chero.server.user.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hxh on 2018/6/19.
 */
@Data
@Entity
@Table(name = "wrap_count")
public class WrapCountPO {
    @Id
    private Long id;
    private Long l;
    private String d;

    public WrapCountPO(Long l, String d) {
        this.l = l;
        this.d = d;
    }
}
