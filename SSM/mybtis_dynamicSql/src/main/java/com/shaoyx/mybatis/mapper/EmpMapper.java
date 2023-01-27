package com.shaoyx.mybatis.mapper;

import java.util.Collection;

import com.shaoyx.mybatis.pojo.Emp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    List<Emp> selectByAll(Emp emp);


    int updateBatch(List<Emp> list);

    int batchInsert(@Param("list") List<Emp> list);

    int insertOrUpdate(Emp record);

    int insertOrUpdateSelective(Emp record);

    int insertList(@Param("list") List<Emp> list);

    int deleteByEmpIdIn(@Param("empIdCollection") Collection<Integer> empIdCollection);


}