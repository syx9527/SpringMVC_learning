package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.User;

import java.util.List;

/**
 * @author SYX
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     *
     * @param username username
     * @return User
     */
    User getUserInfoByUsername(String username);
}
