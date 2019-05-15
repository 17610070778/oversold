package com.yaqi.service.impl;

import com.yaqi.entity.Goods;
import com.yaqi.repository.GoodsRepository;
import com.yaqi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 王亚奇
 * @date 2019/5/15 14:03
 */
@Service
@Transactional
public class GoodsServiceimpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public boolean minus(int i) {
        // 先查询进行加锁
        Goods byId = goodsRepository.findById(i);
        if (byId.getCount() > 0) {
            try {
                System.out.println("减库存 :" + byId.getCount());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 库存减去1
            goodsRepository.minus(byId);
            return true;
        }
        return false;
    }
}
