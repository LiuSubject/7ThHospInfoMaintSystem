package com.system.service;

import com.system.po.ComputerProblemsCustom;
import com.system.po.PushMessage;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsService
 * 类描述：ComputerProblems电脑故障表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface ComputerProblemsService {
    //根据id更新电脑故障信息
    void updataById(Integer id, ComputerProblemsCustom computerProblemsCustom) throws Exception;

    //根据id删除电脑故障信息
    void removeById(Integer id) throws Exception;

    //获取分页查询电脑故障信息
    List<ComputerProblemsCustom> findByPaging(Integer toPageNo) throws Exception;

    //电脑故障信息搜索结果分页(分页有缺陷，暂未使用)
    List<ComputerProblemsCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception;

    //保存电脑故障信息
    Boolean save(ComputerProblemsCustom computerProblemsCustom) throws Exception;

    //事务：保存电脑故障信息，并初始化推送消息
    Boolean saveAndPre(ComputerProblemsCustom computerProblemsCustom, PushMessage preMessage) throws Exception;

    //获取电脑故障总数
    int getCountComputerProblems() throws Exception;

    //获取电脑电脑故障信息搜索结果总数
    int getCountOfSearchResults() throws Exception;

    //根据id获取电脑故障信息
    ComputerProblemsCustom findById(Integer id) throws Exception;

    //根据部门模糊查询
    List<ComputerProblemsCustom> findByDept(String dept) throws Exception;

    //根据名字模糊查询
    List<ComputerProblemsCustom> findByName(String name) throws Exception;

    //根据状态模糊查询
    List<ComputerProblemsCustom> findByFlag(Integer flag) throws Exception;

    //根据申请人工号查询
    List<ComputerProblemsCustom> findByUserID(String code) throws Exception;

    //根据负责人工号查询
    List<ComputerProblemsCustom> findByLeader(String code) throws Exception;
}
