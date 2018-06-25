//package com.chero.bserver.sso.model.pojo.domain;
//
//import lombok.Data;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.SQLDelete;
//import org.hibernate.annotations.Where;
//
//import javax.persistence.*;
//
//import static com.chero.bserver.sso.model.pojo.TableName.DB_CLIENT_AUTHORITIES;
//
///**
// * Created by hxh on 2018/5/8.
// */
//@Data
//@Entity
//@Table(name = DB_CLIENT_AUTHORITIES)
//@SQLDelete(sql = "update " + DB_CLIENT_AUTHORITIES + " set deleted = 1 where id = ?")
//@Where(clause = "deleted = 0")
//public class ClientAuthoritiesPO extends BasePO {
//    private String clientId;
//    private String authoId;
//}
