package com.chero.common.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by hxh on 2018/3/31.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO implements Serializable {
    private String mobile;
    private String password;
    private String smsCode;
}
