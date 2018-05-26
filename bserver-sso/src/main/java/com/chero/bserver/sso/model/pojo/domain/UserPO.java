package com.chero.bserver.sso.model.pojo.domain;

import com.chero.bserver.sso.util.IDUtil;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_USER;

@Data
@Entity
@Table(name = SYS_USER)
@SQLDelete(sql = "update " + SYS_USER + " set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
public class UserPO extends BaseWithoutIdPO implements UserDetails {
    //	@GeneratedValue(generator = "uuid")
//	@SQLInsert(sql = "")
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

    private Integer locked;

    @Transient
    private List<RolePO> roles;

    public UserPO() {
//        this.userId = "Chero" + String.valueOf(System.currentTimeMillis() / 1000) + "r" + String.valueOf((int) ((Math.random() * 1000)));
        this.userId = IDUtil.genRandom4Word(mobile);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RolePO role : roles) {
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
        return !deleted;
    }
}