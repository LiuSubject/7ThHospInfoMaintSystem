package com.system.mapper;

import com.system.po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    //分页查询部门软件需求信息
    List<SoftwareRequirementsCustom> findByPagingOfDepart(Map<String, Object> map) throws Exception;

    //分页查询主管院长软件需求信息
    List<SoftwareRequirementsCustom> findByDpdeanPaging(Map<String, Object> map) throws Exception;

    //软件需求信息搜索结果分页
    List<SoftwareRequirementsCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception;
}