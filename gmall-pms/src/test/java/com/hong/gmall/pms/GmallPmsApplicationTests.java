package com.hong.gmall.pms;

import com.hong.gmall.pms.entity.Product;
import com.hong.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        String name = byId.getName();
        System.out.println(name);
    }

}
