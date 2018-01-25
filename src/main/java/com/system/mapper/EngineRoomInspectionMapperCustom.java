package com.system.mapper;

import com.system.po.EngineRoomInspectionCustom;
import com.system.po.PagingVO;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：EngineRoomInspectionCustomMapper
 * 类描述：EngineRoomInspection拓展类Mapper（机房巡检表拓展类Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface EngineRoomInspectionMapperCustom {
    //分页查询机房巡检信息
    List<EngineRoomInspectionCustom> findByPaging(PagingVO pagingVO) throws Exception;
}