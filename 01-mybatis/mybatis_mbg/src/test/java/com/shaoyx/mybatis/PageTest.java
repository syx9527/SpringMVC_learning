package com.shaoyx.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shaoyx.mybatis.mapper.EmpMapper;
import com.shaoyx.mybatis.pojo.Emp;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Date:2023/1/28
 *
 * @author SYX
 */
public class PageTest {

    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 查询功能之前开启分页
        Page<Object> page = PageHelper.startPage(10, 10);
        List<Emp> empList = mapper.selectByExample(null);
        // 查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(empList, 4);
        System.out.println(pageInfo);
        System.out.println(pageInfo.getList());


    }

}
