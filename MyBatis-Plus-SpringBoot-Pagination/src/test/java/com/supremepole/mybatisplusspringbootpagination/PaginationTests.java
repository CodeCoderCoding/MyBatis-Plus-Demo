package com.supremepole.mybatisplusspringbootpagination;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.supremepole.mybatisplusspringbootpagination.mapper.WebsiteMapper;
import com.supremepole.mybatisplusspringbootpagination.model.Website;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class PaginationTests {

    @Resource
    private WebsiteMapper websiteMapper;

    @Test
    public void testWebisteMapper() {
        Website website=websiteMapper.selectById(1);
        System.out.println(website);
    }

    @Test
    public void testSelectPage() {
        QueryWrapper<Website> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name", "supremepole");
        Page<Website> page= new Page<>(1, 2);
        IPage<Website> iPage=websiteMapper.selectPage(page, queryWrapper);
        System.out.println(iPage.getRecords().size());
        System.out.println("总记录数："+iPage.getTotal());
        System.out.println("总页数："+iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getSize());
    }

}
