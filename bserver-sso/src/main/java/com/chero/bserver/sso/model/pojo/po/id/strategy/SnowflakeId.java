package com.chero.bserver.sso.model.pojo.po.id.strategy;


import com.chero.bserver.sso.util.IDUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author hxh
 * @date 2018/7/5
 */
public class SnowflakeId implements IdentifierGenerator {



    @Override
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        return Long.valueOf(IDUtil.gen18Id());
    }
}
