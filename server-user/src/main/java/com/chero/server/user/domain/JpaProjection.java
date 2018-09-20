package com.chero.server.user.domain;

import lombok.Data;
import org.springframework.data.web.ProjectedPayload;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author hxh
 * @date 2018/8/7
 */
@Data
public class JpaProjection {

    Date jpaDate;
    String jpaId;
    Integer jpaInt;
    Long jpaLong;
    String jpaString;

    public JpaProjection() {
    }

    public JpaProjection(Date jpaDate, String jpaId, Integer jpaInt, Long jpaLong, String jpaString) {
        this.jpaDate = jpaDate;
        this.jpaId = jpaId;
        this.jpaInt = jpaInt;
        this.jpaLong = jpaLong;
        this.jpaString = jpaString;
    }
}
