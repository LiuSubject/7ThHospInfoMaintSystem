package com.system.mapper;

import com.system.po.MaType;

public interface MaTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaType record);

    int insertSelective(MaType record);

    MaType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaType record);

    int updateByPrimaryKey(MaType record);
}