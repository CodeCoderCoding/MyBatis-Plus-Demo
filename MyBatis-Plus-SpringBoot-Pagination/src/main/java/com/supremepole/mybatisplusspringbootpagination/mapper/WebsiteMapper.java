package com.supremepole.mybatisplusspringbootpagination.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.supremepole.mybatisplusspringbootpagination.model.Website;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Mapper
public interface WebsiteMapper extends BaseMapper<Website> {

}
