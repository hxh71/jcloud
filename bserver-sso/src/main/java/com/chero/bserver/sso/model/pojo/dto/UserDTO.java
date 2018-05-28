package com.chero.bserver.sso.model.pojo.dto;

import com.chero.bserver.sso.model.pojo.domain.RolePO;
import com.chero.bserver.sso.model.pojo.domain.UserPO;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/5/11.
 * key = user、value = 用户信息， 如果没有信息返回null；
 * key = allRoles、 value
 */
@Data
public class UserDTO implements UserDetails{
    @Id
    private String userId;
    /**
     * 用户名（手机号）
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;

    private Boolean locked;
    /**
     * 上次修改密码时间
     */
    private Date lastUpdatePassword;
    /**
     * 上次修改手机号时间
     */
    private Date lastUpdateMobile;
    private List<RoleDTO> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleDTO role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleId()));
        }
        return authorities;

    }

    @Override
    public String getUsername() {
        return mobile;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return !locked;
    }
}
