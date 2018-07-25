package com.chero.bserver.sso.config;

import com.chero.bserver.sso.model.pojo.domain.UserDO;
import com.chero.bserver.sso.model.repository.ClientDAO;
import com.chero.bserver.sso.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.security.Principal;

/**
 * @author hxh
 * @date 2018/7/5
 */

@Configuration
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return () ->  {
           Object obj =  UserUtil.getCurrentUser();
           if (obj instanceof UserDO) {
                return ((UserDO) obj).getUserId();
           } else {
               return obj.toString();
           }
        };
    }
}

