package com.system.mapper;

import com.system.po.EngineRoomInspectionCustom;
import com.system.po.PagingVO;

import java.util.List;

public interface EngineRoomInspectionMapperCustom {
    //分页查询电脑故障
    List<EngineRoomInspectionCustom> findByPaging(PagingVO pagingVO) throws Exception;
}