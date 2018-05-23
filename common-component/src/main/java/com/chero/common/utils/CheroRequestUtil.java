package com.chero.common.utils;

import com.chero.common.pojo.constant.SecurityConstant;
import com.chero.common.pojo.dto.AccessTokenDTO;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by hxh on 2017/12/18.
 *
 * @author hxh
 */
@Slf4j
@Component
public class CheroRequestUtil {
    /**
     * 从jwt中获取userId
     * @param request
     * @return
     */
    public String getUserId(HttpServletRequest request) {
        Claims claims = this.getClaims(request);
        String userId = null;
        if(claims != null) {
            userId = (String)claims.get("userId");
        }
        return userId;
    }
    /**
     * 从jwt中获取userId
     * @param header
     * @return
     */
    public String getUserId(String header) {
        Claims claims = this.getClaims(header);
        String userId = null;
        if(claims != null) {
            userId = (String)claims.get("userId");
        }
        return userId;
    }
    public String getMainRoleId(HttpServletRequest request) {
        Claims claims = this.getClaims(request);
        String mainRoleId = null;
        if(claims != null) {
            mainRoleId = (String)claims.get("mainRoleId");
        }
        return mainRoleId;
    }
    public String getMainRoleId(String header) {
        Claims claims = this.getClaims(header);
        String mainRoleId = null;
        if(claims != null) {
            mainRoleId = (String)claims.get("mainRoleId");
        }
        return mainRoleId;
    }

    public AccessTokenDTO getAccessTokenDTO(HttpServletRequest request) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        Claims claims = this.getClaims(request);
        if(claims != null) {
            String userId = (String)claims.get("userId");
            String mainRoleId = (String)claims.get("mainRoleId");
            accessTokenDTO.setUserId(userId);
            accessTokenDTO.setMainRoleId(mainRoleId);
        }
        return accessTokenDTO;
    }

    private Claims getClaims(String header) {
        String token = StringUtils.substringAfter(header,"bearer ");
        if(token == null || "".equals(token)) {
            token = StringUtils.substringAfter(header,"Bearer ");
        }
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(SecurityConstant.JWT_SIGNING_KEY.getBytes("UTF-8"))
                    .parseClaimsJws(token).getBody();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            log.info("【请求工具分析错误】");
            return null;
        }
//        Integer expiresIn = (Integer)claims.get("expires_in");
//        if(expiresIn < 1) {
//            claims = null;
//        }
        return claims;
    }
    public Claims getClaims(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        return this.getClaims(header);
    }
}
