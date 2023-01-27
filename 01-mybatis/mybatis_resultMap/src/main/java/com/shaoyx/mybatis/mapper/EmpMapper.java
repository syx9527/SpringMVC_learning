package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Emp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author SYX
 */
public interface EmpMapper {

    /**
     * 获取员工信息
     *
     * @param empId empId
     * @return
     */
    Emp selectEmpById(@Param("empId") Integer empId);

    /**
     * 获取员工以及所对应的部门信息
     *
     * @param empId empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分布查询员工以及对应的部门信息的第一步
     *
     * @param empId empId
     * @return Emp
     */
    Emp getEmpAndDeptByEmpIdStep(@Param("empId") Integer empId);

    /**
     * 通过部门id分布查询该部门的员工信息
     *
     * @param deptId empId
     * @return List<Emp>
     */
    List<Emp> selectEmpByDeptId(@Param("deptId") Integer deptId);


}