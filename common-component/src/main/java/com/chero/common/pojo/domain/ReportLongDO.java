package com.chero.common.pojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportLongDO {
    private String id;
    private String userInfoId; //用户id
    private String userName;//姓名
    private String userGender;//性别
    private String userAge;//年龄
    private String filePath;//文件路径(预留)
    private Date startTime;//测量开始时间
    private Date endTime;//测量结束时间
    private String reportId;//报告编号
    private String idCode;//id编号
    private String validTime;//有效时长
    private Integer heartBeatCount;//总心搏数
    private Integer heartRateHigh;//高心率
    private Date heartRateHighTime;// 高心率发生时间
    private Integer heartRateLow;//低心率
    private Date heartRateLowTime;//低心率发生时间
    private Integer heartRateAverage;// 平均心率
    private Double rrLong; // 最长RR间期
    private Integer rrCount;// RR间期>2.0秒总数
    private Integer svesCount;//SVES（室上性早搏）总数
    private Double svesRatio;//SVES（室上性早搏）占比
    private Integer svesSingleCount;//SVES（单发室上性早搏) 总数
    private Double svesSingleRatio;//SVES（单发室上性早搏）占比
    private Integer svesPairedCount;//SVES（成对室上性早搏）总数
    private Double svesPairedRatio;//SVES（成对室上性早搏）占比
    private Integer svesBigeminyPosition;//SVES（室上性二联律）阵
    private Integer svesBigeminyCount;// SVES（室上性二联律）次
    private Integer svesTrigeminyPosition;// SVES（室上性三联律）阵
    private Integer svesTrigeminyCount;// SVES（室上性三联律）次
    private String svesShort;//室上性联律间期最短（ms）
    private Date svesShortTime;//室上性联律间期最短时间
    private Integer vpbCount;//VPB(室性早搏)  总数
    private Double vpbRatio;//VPB(室性早搏)  占比
    private Integer vpbSingleCount;//VPB(单发室性早搏) 总数
    private Double vpbSingleRatio;//VPB(单发室性早搏) 占比
    private Integer vpbPairedCount;//VPB(成对室性早搏) 总数
    private Double vpbPairedRatio;//VPB(成对室性早搏) 占比
    private Integer vpbBigeminyPosition;//室性二联律（阵）
    private Integer vpbBigeminyCount;//室性二联律（次）
    private Integer vpbTrigeminyPosition;//室性三联律（阵）
    private Integer vpbTrigeminyCount;//室性三联律（次）
    private Integer vpbShort;//室性联律间期最短（ms）
    private Date vpbShortTime;//室性联律间期最短时间
    private Integer stPosition;//室上速 阵
    private Integer stCount;//室上速 次
    private Double stRatio;//室上速 占比
    private Integer stLong;//室上速最长
    private Date stLongTime;//室上速最长发生时间
    private Integer stFast;//室上速最快
    private Date stFastTime;//室上速最快发生时间
    private Integer vtPosition;//室速 阵
    private Integer vtCount;//室速 次
    private Double vtRatio;//室速 占比
    private Integer vtLong;//室速最长
    private Date vtLongTime;//室速最长发生时间
    private Integer vtFast;//室速最快
    private Date vtFastTime;//室速最快发生时间
    private Integer afibPosition;//房颤 阵
    private Integer afibCount;//房颤 次
    private Double afibRatio;//房颤 占比
    private Integer afibLong;//房颤最长
    private Date afibLongTime;//房颤最长发生时间
    private Integer afibFast;//房颤最快
    private Date afibFastTime;//房颤最快发生时间
    private String summarizeDoctor;//医生总结
    private Integer reportState = 0;//报告状态 0:未申请诊断，1诊断中， 2诊断结束
    private Date reportStateTime;//请求诊断时间
    private String diseaseTime;//疾病时间段
    private String diseaseTimeValid;//疾病时间段 - 有效时长
    private String diseaseHeartBeat;//疾病时间段 - 心搏数
    private String diseaseHeartRateAverage;//疾病时间段 - 平均心率
    private String diseaseHeartRateHigh;//疾病时间段 - 高心率
    private String diseaseHeartRateLow;//疾病时间段 - 低心率
    private String diseaseSves;//疾病时间段 - 室上早
    private String diseaseSt;//疾病时间段 - 室上速
    private String diseaseVpb;//疾病时间段 - 室早
    private String diseaseVt;//疾病时间段 - 室速
    private String diseaseAfib;//疾病时间段 - 房颤
    private String diseaseLong;//疾病时间段 - 长间歇
    private String diseaseList;//疾病列表
    private String diseaseListTime;//疾病发生时间\
    private String scatterX;//散点图x集合
    private String scatterY;//散点图y集合
}
