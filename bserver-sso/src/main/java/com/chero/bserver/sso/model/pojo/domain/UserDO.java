package com.chero.bserver.sso.model.pojo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Id;
import java.util.*;

/**
 * Created by hxh on 2018/5/11.
 * key = user、value = 用户信息， 如果没有信息返回null；
 * key = allRoles、 value
 */
@Data
public class UserDO implements UserDetails{
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

    private Boolean enabled;
    /**
     * 上次修改密码时间
     */
    private Date lastUpdatePassword;
    /**
     * 上次修改手机号时间
     */
    private Date lastUpdateMobile;
    private List<RoleDO> roles;


    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleDO role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleId()));
        }
        return authorities;

    }

    @Override
    @JsonIgnore
    public String getUsername() {
        return mobile;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UserDO userDO = (UserDO) o;

        if (!userId.equals(userDO.userId)) return false;
        return mobile.equals(userDO.mobile);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + mobile.hashCode();
        return result;
    }
}
