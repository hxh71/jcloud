package com.chero.common.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hxh44 on 2018/4/11.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BindMobileDTO {
    private String mobile;
    private String password;
}
