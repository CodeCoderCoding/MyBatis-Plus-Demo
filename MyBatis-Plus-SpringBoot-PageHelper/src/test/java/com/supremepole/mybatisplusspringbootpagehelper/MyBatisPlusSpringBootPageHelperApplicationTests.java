package com.supremepole.mybatisplusspringbootpagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supremepole.mybatisplusspringbootpagehelper.mapper.WebsiteMapper;
import com.supremepole.mybatisplusspringbootpagehelper.model.Website;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlusSpringBootPageHelperApplicationTests {

    @Autowired
    private WebsiteMapper websiteMapper;
    @Test
    void test() {
        PageInfo<Website> websitePageInfo= PageHelper.startPage(1,2).doSelectPageInfo(()->websiteMapper.selectById(1));
        System.out.println(websitePageInfo.getSize());
    }

}
