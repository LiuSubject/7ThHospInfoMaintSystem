package com.system.service;

import com.system.po.ViewEmployeeMiPsd;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ViewEmployeeMiPsdService
 * 类描述：ViewEmployeeMiPsd登录表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-05 16:00
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface ViewEmployeeMiPsdService {
    //根据名字查找用户
    ViewEmployeeMiPsd findByName(String name) throws Exception;

    //根据工号查找用户
    ViewEmployeeMiPsd findByCode(String code) throws Exception;

    //保存用户登录信息
    void save(ViewEmployeeMiPsd viewEmployeeMiPsd) throws Exception;

    //根据姓名删除
    void removeByName(String name) throws Exception;

    //根据用户名更新
    void updateByName(String name, ViewEmployeeMiPsd viewEmployeeMiPsd);
}
