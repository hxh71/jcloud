package com.chero.server.mybatis.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.chero.server.mybatis.domain.TestDO;
import com.chero.server.mybatis.domain.WrapCountDO;
import com.chero.server.mybatis.domain.WrapCountPO;
import lombok.Data;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author hxh
 */
@Repository
public interface TestMapper extends BaseMapper<TestDO> {

//    TestDO findAllBySLike(String[] str);
//
//
//    @Query("SELECT " +
//            "new com.chero.server.user.domain.WrapCountDO(COUNT(t), t.uid, t.s) " +
//            "FROM TestDO t " +
//            "WHERE t.i != 0 " +
//            "GROUP BY t.uid")
//        // group by会分类形成List
//    List<WrapCountDO> count1111(Example<TestDO> example);
//
//    @Query("SELECT " +
//            "new WrapCountPO(COUNT(t), t.uid) " +    // 实体类
//            "FROM TestDO t " +
//            "WHERE t.i != 0 " +
//            "GROUP BY t.uid")
//        // group by会分类形成List
//    List<WrapCountPO> count2222();
//
//    @Query(value = "SELECT " +
//            "s, testa, testb, uid " +    // 实体类
//            "FROM test " +
//            "WHERE i != 0 " +
//            "GROUP BY uid", nativeQuery = true)  // group by会分类形成List
//    List<NameOnly> count3();
////    TestDO (String username);
//     interface NameOnly {
////        @Value("#{target.count}")
////        Integer getCount();
//        String[] getS();
//        Long getTesta();
//        String getTestb();
//        String getV();
//}
//    @Data
//    class NameOnlyImpl {
//        private Integer count;
//        private String uid;
//        private String testA;
//        private String testB;
//    }
}