package org.javatribe.lottery.mapper;

import org.apache.ibatis.annotations.Param;
import org.javatribe.lottery.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_item表
 * @author JimZiSing
 */
@Repository
public interface ItemMapper {

    /**
     * 插入一行数据
     * @param item
     * @return
     */
    int insertItem(Item item);

    /**
     * 根据prizeId查询
     * @param prizeId
     * @return
     */
    List<Item> queryItemByPrizeId(@Param("prizeId")Integer prizeId);

    /**
     * 更新奖项信息
     * @param item
     */
    void updateItem(Item item);

    /**
     * 奖项剩余量减一
     * @param id
     */
    void updateItemDecrById(@Param("id") Integer id);

    /**
     * 更新奖项剩余量为0
     * @param id
     */
    void updateItemAmountTo0(@Param("id") Integer id);
}
