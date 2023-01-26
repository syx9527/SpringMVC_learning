package com.shaoyx.mybatis.mapper;

import com.shaoyx.mybatis.pojo.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}