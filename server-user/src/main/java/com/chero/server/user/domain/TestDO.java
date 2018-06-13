package com.chero.server.user.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

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
	private Long testA;

//  @JsonIgnore
	private String testB;


}