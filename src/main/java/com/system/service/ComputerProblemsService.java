package com.system.service;

import com.system.po.ComputerProblemsCustom;
import com.system.po.ComputerProblemsExample;
import com.system.po.StudentCustom;

import java.util.List;

/**
 * ComputerProblems电脑故障Service层
 */
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

    //根据名字模糊查询
    List<ComputerProblemsCustom> findByName(String name) throws Exception;
}
