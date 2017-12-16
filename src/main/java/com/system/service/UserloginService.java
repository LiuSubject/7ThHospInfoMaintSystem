package com.system.service;

import com.system.po.Userlogin;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：UserloginService
 * 类描述：Userlogin登录表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface UserloginService {

    //根据名字查找用户
    Userlogin findByName(String name) throws Exception;

    //保存用户登录信息
    void save(Userlogin userlogin) throws Exception;

    //根据姓名删除
    void removeByName(String name) throws Exception;

    //根据用户名更新
    void updateByName(String name, Userlogin userlogin);

}
