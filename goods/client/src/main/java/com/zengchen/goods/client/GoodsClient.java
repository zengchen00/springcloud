package com.zengchen.goods.client;

import com.zengchen.goods.common.SizeOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "goods")
public interface GoodsClient {

    @GetMapping(value = "size/getSizes")
    public List<SizeOutput> getSizes();

}
