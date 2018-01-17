package com.system.service;

import com.system.po.ComputerProblemsType;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsTypeService
 * 类描述：ComputerProblemsType电脑故障类型表Service接口层
 * 创建人：lxk
 * 创建时间：2018-1-9 10:03:11
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface ComputerProblemsTypeService {
    //获取可选电脑故障
    List<ComputerProblemsType> getAll();

    //获取可选电脑故障
    List<ComputerProblemsType> getSecondaryList(String mainType);
}
