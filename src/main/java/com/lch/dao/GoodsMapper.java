package com.lch.dao;

import com.lch.javabean.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    Goods getGoods(int gds_id);
}
