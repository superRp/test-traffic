package com.rp.controller;

import com.rp.entity.Good;
import com.rp.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping()
    public List<Good> getGoodsInfo(){
        return goodsService.getGoodsInfo();
    }
}
