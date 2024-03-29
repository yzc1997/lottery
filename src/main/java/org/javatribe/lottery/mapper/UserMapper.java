package org.javatribe.lottery.mapper;

import org.apache.ibatis.annotations.Param;
import org.javatribe.lottery.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理User表
 * @author JimZiSing
 */
@Repository
public interface UserMapper {

    /**
     * 插入UserInfo一行数据一行数据
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 根据openid 查询用户
     * @param openid
     * @return
     */
    User queryUserByOpenid(String openid);

    List<User> queryAllUser();

    /**
     * 根据ip查询登录过的用户
     * @param realIp
     * @return
     */
    User queryUserByIp(@Param("ip") String realIp);
}
