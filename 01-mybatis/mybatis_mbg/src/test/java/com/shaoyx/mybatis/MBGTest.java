package com.shaoyx.mybatis;

import com.shaoyx.mybatis.mapper.EmpMapper;
import com.shaoyx.mybatis.pojo.Emp;
import com.shaoyx.mybatis.pojo.EmpExample;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Date:2023/1/27
 *
 * @author SYX
 */
public class MBGTest {

    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);


//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);


        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andDeptIdEqualTo(1).andAgeGreaterThanOrEqualTo(20);
        empExample.or().andGenderEqualTo("女");

        List<Emp> empList = mapper.selectByExample(empExample);
        empList.forEach(System.out::println);
    }

    @Test
    public void testMBGUpdateByPrimaryKey() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = new Emp(10, "李小娥", null, "女");
        mapper.updateByPrimaryKeySelective(emp);

    }


}
