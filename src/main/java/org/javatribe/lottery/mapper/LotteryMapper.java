package org.javatribe.lottery.mapper;

import org.javatribe.lottery.entity.Lottery;
import org.springframework.stereotype.Repository;

/**
 * 处理 lottery 表mapper 接口
 * @author JimZiSing
 */
@Repository
public interface LotteryMapper {
    /**
     * 插入一条数据
     * @param lottery
     */
    void insertLottery(Lottery lottery);
}