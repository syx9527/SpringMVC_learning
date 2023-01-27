package com.shaoyx.mybatis;

import com.shaoyx.mybatis.pojo.Dept;
import com.shaoyx.mybatis.pojo.Emp;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import com.shaoyx.mybatis.mapper.DeptMapper;
import com.shaoyx.mybatis.mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Date:2023/1/27
 *
 * @author SYX
 */
public class ResultMapper {
    @Test
    public void selectByPrimaryKey() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectEmpById(1);
        System.out.println(emp);

    }


    @Test
    public void getEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }

    @Test
    public void getEmpAndDeptByEmpIdStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpIdStep(1);
        System.out.println(emp);
    }

    @Test
    public void getDeptEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptEmpByDeptId(1);
        System.out.println(dept);
    }

    @Test
    public void selectDeptAndEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectDeptAndEmpByDeptId(1);
        System.out.println(dept.infoMessage());
        dept.getEmps().forEach(System.out::println);

    }


}
