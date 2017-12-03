package com.system.service;

import com.system.po.ComputerProblemsCustom;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsService
 * 类描述：ComputerProblems电脑故障表Service层
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

    //保存电脑故障信息
    Boolean save(ComputerProblemsCustom computerProblemsCustom) throws Exception;

    //获取电脑故障总数
    int getCountComputerProblems() throws Exception;

    //根据id获取电脑故障信息
    ComputerProblemsCustom findById(Integer id) throws Exception;

    //根据部门模糊查询
    List<ComputerProblemsCustom> findByDept(String dept) throws Exception;

    //根据名字模糊查询
    List<ComputerProblemsCustom> findByName(String name) throws Exception;

    //根据状态模糊查询
    List<ComputerProblemsCustom> findByFlag(Integer flag) throws Exception;
}
