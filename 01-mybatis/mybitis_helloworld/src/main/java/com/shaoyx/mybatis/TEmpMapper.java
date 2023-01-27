package com.shaoyx.mybatis;

import com.shaoyx.TEmp;

public interface TEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    TEmp selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
}