package com.yaqi.repository;

import com.yaqi.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 王亚奇
 * @date 2019/5/15 14:03
 */
@Mapper
public interface GoodsRepository {
    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    Goods findById(int id);

    void minus(Goods goods);
}
