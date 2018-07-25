package com.chero.bserver.sso.model.service.impl;

import com.chero.bserver.sso.model.service.RbacService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;


@Service("rbacService") // 这个一定要加，要不然无法在access()spel中识别
public class RbacServiceImpl implements RbacService {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        boolean hasPermission = false;
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();

            // 读取用户所拥有权限的所有URL
            Set<String> urls = new HashSet<>();

            for (String url :
                    urls) {
                if (antPathMatcher.match(url, request.getRequestURI())) {
                    hasPermission = true;
                    break;
                }
            }

            return true;
        }
        return true;
    }
}
