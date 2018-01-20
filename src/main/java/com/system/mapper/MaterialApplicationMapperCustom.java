package com.system.mapper;

import com.system.po.ComputerProblemsCustom;
import com.system.po.MaterialApplicationCustom;
import com.system.po.PagingVO;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationCustomMapper
 * 类描述：MaterialApplication拓展类Mapper（物资申购表拓展类Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface MaterialApplicationMapperCustom {
    //分页查询物资申购
    List<MaterialApplicationCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //分页查询可处理物资申购
    List<MaterialApplicationCustom> findByApprovedPaging(PagingVO pagingVO) throws Exception;

    //分页查询部门物资申购
    List<MaterialApplicationCustom> deptFindByPaging(Map<String, Object> condition) throws Exception;

    //分页查询分管院长相关（本部门及待其审批）物资申购信息
    List<MaterialApplicationCustom> deptAndApproveFindByPaging(Map<String, Object> condition) throws Exception;


    //电脑故障信息搜索结果分页
    List<MaterialApplicationCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception;
}