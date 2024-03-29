package org.javatribe.lottery.entity;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.Data;


/**
 * (Item)实体类
 *
 * @author jimzising
 * @since 2019-09-20 15:22:55
 */
    

@Data
public class Item implements Serializable {
    private static final long serialVersionUID = -38168543741356184L;
            
    private Integer id;
    /** 
     * 奖项
     */        
    private String itemName;
    /**
     * 可获奖人数
     */
    private int amount;
    /**
     * 剩余奖项
     */

    private int surplus;
    private AtomicInteger surplus1;


    /**
     * 所属抽奖
     */
    private Integer prizeId;

}