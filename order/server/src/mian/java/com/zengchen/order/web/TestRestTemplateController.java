package com.zengchen.order.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
@RequestMapping("/test")
public class TestRestTemplateController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "getFromGoods")
    public String getSizes() {
           // 方式1
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8081/size/getSizes",String.class);

          //方式2
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance goodsService = loadBalancerClient.choose("GOODS");
//        String url = String.format("http://%s:%s",goodsService.getHost(),goodsService.getPort()+"/size/getSizes");
//        String response = restTemplate.getForObject(url,String.class);

        String response = restTemplate.getForObject("http://GOODS/size/getSizes",String.class);
        log.info("****response****:{}",response);
        return response;
    }
}

