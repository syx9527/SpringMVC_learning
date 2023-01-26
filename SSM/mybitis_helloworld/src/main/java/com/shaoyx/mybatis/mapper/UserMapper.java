package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.User;

import java.util.List;

/**
 * @author SYX
 */
public interface UserMapper {

    /**
     * 新增用户
     *
     * @return Integer
     */
    Integer insertUser();

    /**
     * 修改用户
     *
     * @return Integer
     */
    Integer updateUser();

    /**
     * 删除用户
     *
     * @return Integer
     */
    Integer deleteUser();

    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return Integer
     */
    User getUserById(Integer id);

    /**
     * 查询所有用户
     *
     * @return allUserList
     */
    List<User> getAllUser();
}
