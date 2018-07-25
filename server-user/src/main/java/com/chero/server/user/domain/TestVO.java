//package com.chero.server.user.domain;
//
//import com.chero.server.user.annotation.TimestampFormat;
//import org.springframework.data.jpa.repository.Query;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * @author hxh
// * @date 2018/7/5
// */
//
//@Entity
//@NamedNativeQuery(
//        name = "TestVO.test",
//        query = "SELECT " +
//                "s, testa, testb, uid " +    // 实体类
//                "FROM test " +
//                "WHERE i != 0 " +
//                "GROUP BY uid",
//        resultSetMapping = "test")
//@SqlResultSetMapping(
//        name = "test",
//        entities = {
//                @EntityResult(entityClass = TestVO.class,
//                        fields = {
//                                @FieldResult(name = "s",column = "s"),
//                                @FieldResult(name = "testa",column = "testb"),
//                                @FieldResult(name = "testb",column = "testb"),
//                                @FieldResult(name = "uid",column = "uid")
//                        })
//        })
//public class TestVO {
//    private String uid;
//    private Long testa;
//    private String testb;
//    private String[] s;
//    private Date[] d2;
//    private Integer i;
//}
