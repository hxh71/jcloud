package com.chero.common.pojo.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by hxh on 2018/4/19.
 */
@Data
public class PayOrderForm {

    private String orderId;
    private String returnUrl;

}
