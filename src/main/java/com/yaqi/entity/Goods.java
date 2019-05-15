package com.yaqi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author 王亚奇
 * @date 2019/5/15 13:55
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    /**
     * 主键id
     */
    private int id;
    /**
     * 商品名
     */
    private String goodsName;
    /**
     * 商品剩余数量
     */
    private int count;

}
