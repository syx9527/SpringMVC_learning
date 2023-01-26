package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.User;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void getUserInfoByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User sys = mapper.getUserInfoByUsername("sys");
        System.out.println(sys);
    }
}
