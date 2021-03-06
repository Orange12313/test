package com.lch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lch.dao.GoodsMapper;
import com.lch.javabean.Goods;

@Service("GoodsService")
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods getGoodsById(int gds_id) {
        return goodsMapper.getGoods(gds_id);
    }
    public GoodsServiceImpl(){
        System.out.println("GoodsServiceImpl 构造");
    } }