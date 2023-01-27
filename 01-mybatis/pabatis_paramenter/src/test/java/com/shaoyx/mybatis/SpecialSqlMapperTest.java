package com.shaoyx.mybatis;


import com.shaoyx.User;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpecialSqlMapperTest {

    @Test
    public void getUserByUsernameLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<User> list = mapper.getUserByUsernameLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void deleteMore() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(20);

        mapper.deleteMoreUser(list.toString().replace("[", "").replace("]", ""));

    }

    @Test
    public void getAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<User> user = mapper.getAllUser("t_user");
        System.out.println(user);

    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        User user = new User(null, "xiaoming", "222", 34, "男", "12@q.com");
        int userId = mapper.insertUser(user);
        System.out.println(user);
    }
}