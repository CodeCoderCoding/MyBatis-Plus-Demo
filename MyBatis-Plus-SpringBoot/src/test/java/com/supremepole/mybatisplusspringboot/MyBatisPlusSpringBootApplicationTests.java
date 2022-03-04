package com.supremepole.mybatisplusspringboot;

import com.supremepole.mybatisplusspringboot.mapper.WebsiteMapper;
import com.supremepole.mybatisplusspringboot.model.Website;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyBatisPlusSpringBootApplicationTests {
    @Resource
    private WebsiteMapper websiteMapper;

    @Test
    public void testWebisteMapper() {
        Website website=websiteMapper.selectById(1);
        System.out.println(website);
    }

}
