package com.chero.bserver.sso.util;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by hxh on 2018/5/15.
 */
public class UserUtil {
    public static Object getCurrentUser() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
