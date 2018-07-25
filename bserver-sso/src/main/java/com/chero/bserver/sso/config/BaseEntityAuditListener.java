package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.pojo.po.base.BaseSnowflakeIdPO;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.auditing.IsNewAwareAuditingHandler;
import org.springframework.data.config.ParsingUtils;
import org.springframework.data.domain.Auditable;
import org.springframework.util.Assert;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * @author hxh
 * @date 2018/7/9
 */
@Configurable
public class BaseEntityAuditListener {


    private ObjectFactory<AuditingHandler> handler ;

//    /**
//     * Configures the {@link AuditingHandler} to be used to set the current auditor on the domain types touched.
//     *
//     * @param auditingHandler must not be {@literal null}.
//     */
    public BaseEntityAuditListener() {
        ParsingUtils.getObjectFactoryBeanDefinition("jpaAuditingHandler", null);
        this.handler = (ObjectFactory<AuditingHandler>) ParsingUtils.getObjectFactoryBeanDefinition("jpaAuditingHandler", null);
    }

    /**
     * Sets modification and creation date and auditor on the target object in case it implements {@link Auditable} on
     * persist events.
     *
     * @param target
     */
    @PrePersist
    public void touchForCreate(Object target) {
        if (handler != null) {
            handler.getObject().markCreated(target);
        }
    }

    /**
     * Sets modification and creation date and auditor on the target object in case it implements {@link Auditable} on
     * update events.
     *
     * @param target
     */
    @PreUpdate
    public void touchForUpdate(Object target) {
        if (handler != null) {
            handler.getObject().markModified(target);
        }
    }

    @PreRemove
    public void touchForRemove(BaseSnowflakeIdPO target) {
        if (handler != null) {
            handler.getObject().markModified(target);
        }
    }

}
