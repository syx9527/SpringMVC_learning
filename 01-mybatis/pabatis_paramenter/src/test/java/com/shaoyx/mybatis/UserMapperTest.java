package com.shaoyx.mybatis;

import com.shaoyx.User;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class UserMapperTest {

    @Test
    public void getUserInfoByUsernameTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserInfoByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void checkLoginTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin", "9527");
        System.out.println(user);
    }

    @Test
    public void checkLoginByMapTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "9527");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void insertUserTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "root", "123456", 33, "女", "123@163.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void checkLoginByParamTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin", "9527");
        System.out.println(user);
    }


}
