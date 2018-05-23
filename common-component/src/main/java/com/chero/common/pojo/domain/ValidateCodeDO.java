package com.chero.common.pojo.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hp on 2018/4/8.
 */

@Data
public class ValidateCodeDO implements Serializable{
    /**
     * 验证码
     */
    private String code;
    /**
     * 过期时间
     */
    private LocalDateTime expireTime;

    /**
     *
     * @param code     验证码
     * @param expireIn 单位 秒
     */
    public ValidateCodeDO(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCodeDO(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
