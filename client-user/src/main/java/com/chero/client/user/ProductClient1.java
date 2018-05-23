/*
package com.chero.product.client;

import com.chero.VO.ProductVO;
import com.chero.VO.ResultVO;
import com.chero.product.common.DecreaseStockInput;
import com.chero.product.common.ProductInfoOutput;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

*/
/**
 * Created by 廖师兄
 * 2017-12-10 21:04
 *//*

@FeignClient(name = "PRODUCT", fallback = ProductClient.ProductClientFallback.class)
public interface ProductClient {

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);

    @GetMapping("/product/list")
    ResultVO<ProductVO> list();

    @Component
    static class ProductClientFallback implements ProductClient {

        @Override
        public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
            return null;
        }

        @Override
        public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {

        }

        @Override
        public ResultVO<ProductVO> list() {
            return null;
        }
    }
}
*/
