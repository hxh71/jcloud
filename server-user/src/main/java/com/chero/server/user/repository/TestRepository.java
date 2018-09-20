package com.chero.server.user.repository;

import com.chero.server.user.domain.*;
import lombok.Data;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface TestRepository extends JpaRepository<TestDO, String>, JpaSpecificationExecutor<UserDO> {

    TestDO findAllBySLike(String[] str);


    @Query("SELECT t FROM TestDO t WHERE t.createTime > current_timestamp  ")
    List<TestDO> getTList();


    @Query("SELECT " +
            "new com.chero.server.user.domain.WrapCountDO(COUNT(t), t.uid, t.s) " +
            "FROM TestDO t " +
            "WHERE t.i != 0 " +
            "GROUP BY t.uid")
        // group by会分类形成List
    List<WrapCountDO> count1111(Example<TestDO> example);

    @Query("SELECT " +
            "new WrapCountPO(COUNT(t), t.uid) " +    // 实体类
            "FROM TestDO t " +
            "WHERE t.i != 0 " +
            "GROUP BY t.uid")
        // group by会分类形成List
    List<WrapCountPO> count2222();

    @Query(value = "SELECT " +
            "t.uid AS uid2, t.testa AS testa0, t.testb AS testb1 " +    // 实体类
            "FROM test t " +
            "WHERE i != 0 " +
            "GROUP BY uid", nativeQuery = true)  // group by会分类形成List
    List<TestProjection> count3();


    @javax.transaction.Transactional
    @Modifying
    @Query(value = "UPDATE TestDO t SET t.s = ?1 WHERE t.uid = ?2")  // group by会分类形成List
    int update(String[] s, String uid);

//    TestDO (String username);
     interface NameOnly {
//        @Value("#{target.count}")
//        Integer getCount();
        String[] getS();
        Long getTesta();
        String getTestb();
        String getUid();
}
    @Data
    class NameOnlyImpl {
        private Integer count;
        private String uid;
        private String testA;
        private String testB;
    }
}