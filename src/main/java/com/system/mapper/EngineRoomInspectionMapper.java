package com.system.mapper;

import com.system.po.EngineRoomInspection;
import com.system.po.EngineRoomInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineRoomInspectionMapper {
    int countByExample(EngineRoomInspectionExample example);

    int deleteByExample(EngineRoomInspectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EngineRoomInspection record);

    int insertSelective(EngineRoomInspection record);

    List<EngineRoomInspection> selectByExample(EngineRoomInspectionExample example);

    EngineRoomInspection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EngineRoomInspection record, @Param("example") EngineRoomInspectionExample example);

    int updateByExample(@Param("record") EngineRoomInspection record, @Param("example") EngineRoomInspectionExample example);

    int updateByPrimaryKeySelective(EngineRoomInspection record);

    int updateByPrimaryKey(EngineRoomInspection record);
}