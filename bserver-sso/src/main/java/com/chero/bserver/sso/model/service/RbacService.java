package com.chero.bserver.sso.model.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hxh
 * @date 2018/7/4
 */
public interface RbacService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
