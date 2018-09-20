package com.chero.server.user.domain;

import com.chero.server.user.annotation.TimestampFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jpa_test")
@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
@SQLDelete(sql = "update jpa_test-test set deleted = 1 where jpaId = ?")
@Where(clause = "deleted = 0")
public class JpaTestDO extends BaseDO{
	@Id
	@GeneratedValue(generator = "uuid")
	private String jpaId;

	private Long jpaLong;

	private String jpaString;

	private Integer jpaInt;

	@TimestampFormat
	private Date jpaDate;
}