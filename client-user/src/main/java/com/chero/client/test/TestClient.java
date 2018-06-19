package com.chero.client.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hxh on 2018/6/19.
 */
@FeignClient(name = "test")
public interface TestClient {
    @GetMapping("/test/exception/service")
    Object testException(); // 一定要加上value，跟springmvc不一样
}
