package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Emp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

    /**
     * 获取员工信息
     *
     * @param empId empId
     * @return
     */
    Emp selectEmpById(@Param("empId")Integer empId);

    /**
     * 获取员工以及所对应的部门信息
     *
     * @param empId empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);


}