package com.system.mapper;

import com.system.po.*;

import java.util.List;

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
}