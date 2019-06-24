package com.zengchen.order.web;


import com.zengchen.goods.client.GoodsClient;
import com.zengchen.goods.common.SizeOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zengchen123
 * @since 2019-06-15
 */
@RestController
@Slf4j
@RequestMapping("/feign")
public class TestOpenFeignController {

    @Autowired
    private GoodsClient goodsClient;

    @GetMapping(value = "getFromGoods")
    public List<SizeOutput> getSizes() {
        List<SizeOutput> response = goodsClient.getSizes();
        log.info("****response****:{}",response);
        return response;
    }
}

