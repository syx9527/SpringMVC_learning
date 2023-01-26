package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 验证登录
     *
     * @param username 用户名
     * @param password 密码
     * @return user
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录(以map集合作为参数)
     *
     * @param map {username,password}
     * @return user
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户
     *
     * @param user User
     */
    void insertUser(User user);


    /**
     * 验证登录(以@Param注解作为参数)
     *
     * @param username 用户名
     * @param password 密码
     * @return User
     */
    User checkLoginByParam(@Param("username")String username, @Param("password")String password);


}
