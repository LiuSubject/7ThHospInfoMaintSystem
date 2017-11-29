package com.system.mapper;

import com.system.po.MaterialApplication;

public interface MaterialApplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaterialApplication record);

    int insertSelective(MaterialApplication record);

    MaterialApplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaterialApplication record);

    int updateByPrimaryKey(MaterialApplication record);
}