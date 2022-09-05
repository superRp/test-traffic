package com.rp.service;

import com.rp.entity.Good;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {

    public List<Good> getGoodsInfo() {
        List<Good> goods = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Good good = new Good();
            good.setId((long) i);
            good.setName("商品" + i);
            good.setPrice(new BigDecimal(i));
            goods.add(good);
        }
        System.out.println("响应请求");
        return goods;
    }
}
