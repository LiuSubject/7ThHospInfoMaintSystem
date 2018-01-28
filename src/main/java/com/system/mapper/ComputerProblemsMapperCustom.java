package com.system.mapper;

import com.system.po.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsCustomMapper
 * 类描述：ComputerProblems拓展类Mapper（电脑故障表拓展Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface ComputerProblemsMapperCustom {
    //分页查询电脑故障
    List<ComputerProblemsCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //分页查询部门电脑故障
    List<ComputerProblemsCustom> deptFindByPaging(Map<String, Object> condition) throws Exception;

    //分页查询负责组电脑故障
    List<ComputerProblemsCustom> findGroupByPaging(Map<String, Object> condition) throws Exception;

    //分页查询负责组(复合权限)电脑故障
    List<ComputerProblemsCustom> findComplexGroupByPaging(Map<String, Object> condition) throws Exception;

    //返回负责组(复合权限)电脑故障总数
    int getCountComplexGroupComputerProblems(Map<String, Object> condition) throws Exception;

    //电脑故障信息搜索结果
    List<ComputerProblemsCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception;

    //电脑故障信息分组搜索结果
    List<ComputerProblemsCustom> paginationOfgGroupSearchResults(Map<String, Object> condition) throws Exception;

    //电脑故障信息分组(复合权限)搜索结果
    List<ComputerProblemsCustom> paginationOfComplexgGroupSearchResults(Map<String, Object> condition) throws Exception;


}