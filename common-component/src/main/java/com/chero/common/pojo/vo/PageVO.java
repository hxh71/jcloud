package com.chero.common.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hxh on 2018/4/9.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVO {
    private int size;
    private long totalElements;
    private int totalPages;
    private int number;
}
