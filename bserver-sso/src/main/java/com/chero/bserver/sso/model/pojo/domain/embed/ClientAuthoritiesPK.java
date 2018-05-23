package com.chero.bserver.sso.model.pojo.domain.embed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by hxh on 2018/5/10.
 */
@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ClientAuthoritiesPK implements Serializable {

    private String clientId;

    private String authoId;
}
