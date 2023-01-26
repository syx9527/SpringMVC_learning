package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date:2023/1/26
 *
 * @author SYX
 */
public interface SpecialSqlMapper {
    /**
     * 测试模糊查询(用户名)
     *
     * @param username 用户名
     * @return List<User>
     */
    List<User> getUserByUsernameLike(@Param("username") String username);

    /**
     * 批量删除
     *
     * @param ids 用户id--->  1,2,3,4,6
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名，查询所有的用户信息
     *
     * @param tableName 表名
     * @return List<User>
     */
    List<User> getAllUser(@Param("tableName") String tableName);

    /**
     * 添加用户信息
     *
     * @param user user
     * @return useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数user对象的某个属性中
     */
    int insertUser(User user);


}
