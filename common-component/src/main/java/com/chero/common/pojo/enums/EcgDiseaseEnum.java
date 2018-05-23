package com.chero.common.pojo.enums;

import lombok.Data;
import lombok.Getter;

/**
 * Created by hxh44 on 2018/4/16.
 */
@Getter
public enum  EcgDiseaseEnum {
    CH_PVC(5, "室性早搏"),
    CH_SVPB(9,"室上性早搏"),
    CH_SINUS_TACHYCARDIA(50,"窦性心律过速"),
    CH_SINUS_BRADYCARDIA(51, "窦性心律过缓"),
    CH_SINUS_ARREST(52, "52"),
    CH_ARRHY_THMIA(53, "窦性心律不齐"),
    CH_TRIGEMINY(54, "室性三联律"),
    CH_BIGEMINAL_THYTHM(55, "室性二联律"),
    CH_PREMATURE_BEAT(56, "室性早搏成对"),
    CH_AF(57, "房颤"),
    CH_CARDIAC_ARREST(62, "心动停止"),
    CH_TACHYCARDIA(63, "心动过速"),
    CH_BRADYCARDIA(64, "心动过缓"),
    CH_SV_TRIGEMINY(65, "室上性三联律"),
    CH_SV_BIGEMINAL_THYTHM(66, "室上性二联律"),
    CH_SV_PREMATURE_BEAT(67, "室上性早搏成对"),
    ;
    private Integer code;

    private String message;

    EcgDiseaseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
