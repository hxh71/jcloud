package com.chero.common.pojo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * Created by hxh on 2018/4/16.
 */
@Data
public class DiseaseDO{
    private String id;
    private String diseaseName;//疾病名称
    private String diseaseId;//症状描述
}
