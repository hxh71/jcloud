//package com.chero.bserver.sso.model.pojo.domain;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.SQLDelete;
//import org.hibernate.annotations.Where;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import static com.chero.bserver.sso.model.pojo.TableName.SYS_AUTHORITIES;
//
///**
// * Created by hxh on 2018/5/8.
// */
//@Data
//@Entity
//@Table(name = SYS_AUTHORITIES)
//@SQLDelete(sql = "update " + SYS_AUTHORITIES + " set deleted = 1 where id = ?")
//@Where(clause = "deleted = 0")
//@NoArgsConstructor
//
//public class AuthoritiesPO extends BasePO {
//    private String authoId;
//    private String title;
//
//    public AuthoritiesPO(String authoId, String title) {
//        this.authoId = authoId;
//        this.title = title;
//    }
//}
