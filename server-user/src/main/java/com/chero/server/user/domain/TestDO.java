package com.chero.server.user.domain;

import com.chero.server.user.annotation.TimestampFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "test")
@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
@SQLDelete(sql = "update test set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
public class TestDO extends BaseDO{
	@Id
	@GeneratedValue(generator = "uuid")
	private String uid;

//	@Column(columnDefinition = "datetime")
	// long无法转datetime
	private Long testa;

//  @JsonIgnore
	private String testb;
//	@Column(columnDefinition="text(255) not null")
	private String[] s;     //在数据库中存为blob类型
//	private List<String> s2;
//	private List<Date> d1;
	@TimestampFormat
//	@Column(columnDefinition="text(255) not null")
	@Column
	private Date[] d2;

	private Integer i;


}