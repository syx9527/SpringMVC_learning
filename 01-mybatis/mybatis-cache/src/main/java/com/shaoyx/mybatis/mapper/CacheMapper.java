package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Emp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Emp record);



    int insertOrUpdate(Emp record);

    int insertOrUpdateSelective(Emp record);

    List<Emp> selectByAll(Emp cache);

    int updateBatch(List<Emp> list);

    int batchInsert(@Param("list") List<Emp> list);

    Emp selectOneByEmpId(@Param("empId") Integer empId);

    int updateAgeByEmpId(@Param("updatedAge") Integer updatedAge, @Param("empId") Integer empId);



}