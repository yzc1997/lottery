package org.javatribe.lottery.service;

import org.javatribe.lottery.entity.User;

import java.util.List;

/**
 * userservice层接口
 * @author JimZiSing
 */
public interface IUserService {

    User addUser(User user);

    User selectUserByOpenid(String openid);

    List<User> selectUsers();

    /**
     * 记录用户ip
     * @param realIp
     * @return
     */
    String bindUserWithIp(String realIp);
}
