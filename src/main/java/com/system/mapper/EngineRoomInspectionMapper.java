package com.system.mapper;

import com.system.po.EngineRoomInspection;

public interface EngineRoomInspectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EngineRoomInspection record);

    int insertSelective(EngineRoomInspection record);

    EngineRoomInspection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EngineRoomInspection record);

    int updateByPrimaryKey(EngineRoomInspection record);
}