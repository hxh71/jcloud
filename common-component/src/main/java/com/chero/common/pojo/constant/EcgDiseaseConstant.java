package com.chero.common.pojo.constant;

/**
 * Created by hxh on 2018/4/12.
 */
public interface EcgDiseaseConstant {
    int CH_PVC =  5;         /* 标注：V */    /*室性早搏 */ /* premature ventricular contraction */
    int CH_SVPB = 9;      /* 标注: S*/    /*室上性早搏 */ /* premature or ectopic supraventricular beat */
    int CH_SINUS_TACHYCARDIA  =   50;  /* HRST 窦性心律过速，大于100bpm */
    int CH_SINUS_BRADYCARDIA  =   51;  /* HRSB 窦性心律过缓，小于60bpm */
    int CH_SINUS_ARREST  =  52;  /* HRSA 窦性停搏，单个间隔大于2s */
    int CH_ARRHY_THMIA  =  53;  /* HRSI窦性心律不齐，8秒内任何两个RR差值大于0.12秒,或者连续四个RR间隔的平均大于1.5秒 */
    int CH_TRIGEMINY =    54;      /*标注：VT*/   /* HRVTL 室性三联律 */
    int CH_BIGEMINAL_THYTHM = 55;  /*标注:  VB*/   /* HRVB 室性二联律 */
    int CH_PREMATURE_BEAT = 56;    /*标注：VP*/   /* HRPVPB室性早搏成对 */
    int CH_AF = 57;        /*标注：AF */     /* 房颤 */
    int CH_CARDIAC_ARREST = 62;            /* 心动停止 */
    int CH_TACHYCARDIA = 63;               /* 心动过速 */
    int CH_BRADYCARDIA = 64;               /* 心动过缓 */

    int CH_SV_TRIGEMINY =    65;      /*标注：SVT*/   /* 室上性三联律 */
    int CH_SV_BIGEMINAL_THYTHM = 66;   /*标注: SVB*/    /* 室上性二联律 */
    int CH_SV_PREMATURE_BEAT =  67;    /*标注：SVP*/   /* 室上性早搏成对 */
}
