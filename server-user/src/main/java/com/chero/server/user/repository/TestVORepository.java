package com.chero.server.user.repository;

import com.chero.server.user.domain.TestDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hxh
 * @date 2018/7/5
 */
public interface TestVORepository extends JpaRepository<TestDO, String> {
}
