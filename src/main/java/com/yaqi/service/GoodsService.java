package com.yaqi.service;

/**
 * @author 王亚奇
 * @date 2019/5/15 14:02
 */
public interface GoodsService {
    /**
     * 在查询时进行加行级锁
     * @param i
     */
    boolean minus(int i);
}
