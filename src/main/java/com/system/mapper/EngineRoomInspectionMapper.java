package com.system.mapper;

import com.system.po.EngineRoomInspection;
import com.system.po.EngineRoomInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：EngineRoomInspectionMapper
 * 类描述：EngineRoomInspectionMapper（机房巡检表Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

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