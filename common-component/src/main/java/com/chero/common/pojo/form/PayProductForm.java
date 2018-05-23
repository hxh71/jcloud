package com.chero.common.pojo.form;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

/**
 * Created by hxh on 2018/4/19.
 */
@Data
public class PayProductForm {
    String productId;
    Integer productQuantity;
    BigDecimal amount;
    Integer payType;
}
