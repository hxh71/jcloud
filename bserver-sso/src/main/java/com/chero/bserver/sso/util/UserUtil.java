package com.chero.bserver.sso.util;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by hxh on 2018/5/15.
 */
public class UserUtil {
    public static Object getCurrentUser() {
        System.out.println("***************************************************************************");
        System.out.println("我要看一下");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal().getClass().getName());
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
