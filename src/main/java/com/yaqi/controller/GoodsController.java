package com.yaqi.controller;

import com.yaqi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王亚奇
 * @date 2019/5/15 13:58
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @PostMapping(value = "/minus", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String minusCount() {
        boolean minus = goodsService.minus(1);
        return minus ? "Success" : "Fail";
    }
}
