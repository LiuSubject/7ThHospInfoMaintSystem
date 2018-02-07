package com.system.mapper;

import com.system.po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：EngineRoomInspectionCustomMapper
 * 类描述：SoftwareRequirements拓展类Mapper（软件需求表拓展类Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface SoftwareRequirementsCustomMapper {
    //分页查询软件需求信息
    List<SoftwareRequirementsCustom> findByPaging(PagingVO pagingVO) throws Exception;
}