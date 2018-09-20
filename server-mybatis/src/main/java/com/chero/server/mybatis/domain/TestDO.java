package com.chero.server.mybatis.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.chero.server.mybatis.annotation.TimestampFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test")
public class TestDO extends BaseDO{
	@TableId
	private String uid;

//	@Column(columnDefinition = "datetime")
	// long无法转datetime
	private Long testa;

//  @JsonIgnore
	private String testb;
	private String[] s;     //在数据库中存为blob类型
//	private List<String> s2;
//	private List<Date> d1;
	@TimestampFormat
	private Date[] d2;

	private Integer i;

	private String deleted;


}