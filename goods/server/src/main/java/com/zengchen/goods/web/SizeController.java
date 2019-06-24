package com.zengchen.goods.web;


import com.zengchen.goods.common.SizeOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/size")
public class SizeController {

    @GetMapping(value = "getSizes")
    public List<SizeOutput> getSizes() {
        List<SizeOutput> sizes = new ArrayList<SizeOutput>();
        SizeOutput size1 = new SizeOutput();
        size1.setId(1);
        size1.setName("L");
        SizeOutput size2 = new SizeOutput();
        size2.setId(2);
        size2.setName("XL");
        SizeOutput size3 = new SizeOutput();
        size3.setId(3);
        size3.setName("XXL");

        sizes.add(size1);
        sizes.add(size2);
        sizes.add(size3);

        return sizes;
    }
}

