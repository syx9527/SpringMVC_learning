package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Dept;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author SYX
 */
public interface DeptMapper {
    /**
     * delete by primary key
     *
     * @param deptId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer deptId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Dept record);

    int insertOrUpdate(Dept record);

    int insertOrUpdateSelective(Dept record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Dept record);

    /**
     * select by primary key
     *
     * @param deptId primary key
     * @return object by primary key
     */
    Dept selectByPrimaryKey(Integer deptId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Dept record);

    int updateBatch(List<Dept> list);

    int updateBatchSelective(List<Dept> list);

    int batchInsert(@Param("list") List<Dept> list);

    /**
     * 通过部门id查询部门信息
     *
     * @param deptId deptId
     * @return Dept
     */
    Dept selectDeptById(@Param("deptId") Integer deptId);


    /**
     * 根据部门id查新部门以及部门中的员工信息
     *
     * @param deptId deptId
     * @return Dept
     */
    Dept getDeptEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 根据通过分布查询部门及部门专用的员工信息的第一步
     *
     * @param deptId deptId
     * @return Dept
     */
    Dept selectDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
}