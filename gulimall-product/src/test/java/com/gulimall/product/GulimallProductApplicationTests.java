package com.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("小米");
//        brandEntity.setDescript("12131");
//        brandService.save(brandEntity);
//        BrandEntity byId = brandService.getById(1);
//        System.out.println(byId);
        BrandEntity one = brandService.getOne(new QueryWrapper<BrandEntity>().eq("name", "小米"));
        System.out.println(one);

    }


}
