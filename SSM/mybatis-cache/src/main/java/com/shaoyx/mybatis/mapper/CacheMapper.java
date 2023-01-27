package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Cache;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Cache record);



    int insertOrUpdate(Cache record);

    int insertOrUpdateSelective(Cache record);

    List<Cache> selectByAll(Cache cache);

    int updateBatch(List<Cache> list);

    int batchInsert(@Param("list") List<Cache> list);

    Cache selectOneByEmpId(@Param("empId") Integer empId);

    int updateAgeByEmpId(@Param("updatedAge") Integer updatedAge, @Param("empId") Integer empId);



}