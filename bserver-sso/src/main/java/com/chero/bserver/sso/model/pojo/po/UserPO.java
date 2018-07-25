package com.chero.bserver.sso.model.pojo.po;

import com.chero.bserver.sso.model.pojo.po.base.BaseWithoutIdPO;
import com.chero.bserver.sso.util.IDUtil;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLDeleteAll;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.*;

import static com.chero.bserver.sso.model.pojo.TableName.SYS_ROLE;
import static com.chero.bserver.sso.model.pojo.TableName.SYS_USER;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_A;
import static com.chero.bserver.sso.util.SQLDeleteConstant.D_PREFIX;

@Data
@Entity
@Table(name = SYS_USER)
@SQLDelete(sql = D_PREFIX + SYS_USER + D)
//@SQLDeleteAll(sql = D_PREFIX + SYS_USER + D_A)
@Where(clause = "deleted = 0")
public class UserPO extends BaseWithoutIdPO {
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

    private Boolean enabled;
    /**
     * 上次修改密码时间
     */
    private Date lastUpdatePassword;
    /**
     * 上次修改手机号时间
     */
    private Date lastUpdateMobile;


    public UserPO() {
//        this.userId = "Chero" + String.valueOf(System.currentTimeMillis() / 1000) + "r" + String.valueOf((int) ((Math.random() * 1000)));
        this.userId = IDUtil.genRandom4Word(mobile);
    }

}