package com.chero.server.user.repository;
import com.chero.server.user.domain.TestDO;
import com.chero.server.user.domain.UserDO;
import com.chero.server.user.domain.WrapCountDO;
import com.chero.server.user.domain.WrapCountPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.ColumnResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import java.util.List;
//@SqlResultSetMappings({
//        @SqlResultSetMapping(name = "alertMapping", columns = {
//                @ColumnResult(name = "accountId")})
//})
//@NamedNativeQuery(name = "alert",
//        query = "SELECT " +
//            "COUNT(*), t.uid " +    // 实体类
//            "FROM test t " +
//            "WHERE t.i != 0 " +
//            "GROUP BY t.uid";
//        resultSetMapping = "alertMapping")
public interface TestRepository extends JpaRepository<TestDO,String>,JpaSpecificationExecutor<UserDO> {

    TestDO findAllBySLike(String[] str);


    @Query("SELECT" +
            " new com.chero.server.user.domain.WrapCountDO(COUNT(t), t.uid)" +
            " FROM TestDO t" +
            " WHERE t.i != 0" +
            "GROUP BY t.uid")  // group by会分类形成List
    List<WrapCountDO> count1111();
    @Query("SELECT" +
            " new WrapCountPO(COUNT(t), t.uid)" +    // 实体类
            " FROM TestDO t" +
            " WHERE t.i != 0" +
            "GROUP BY t.uid")  // group by会分类形成List
    List<WrapCountPO> count2222();

//    @Query(value = "SELECT " +
//            "COUNT(*), t.uid " +    // 实体类
//            "FROM test t " +
//            "WHERE t.i != 0 " +
//            "GROUP BY t.uid", nativeQuery = true)  // group by会分类形成List

    List<WrapCountPO> count3();
//    TestDO (String username);
}