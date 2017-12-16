package com.system.service;

import com.system.po.PushId;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushIdService
 * 类描述：PushId登录表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-15 15:54:33
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface PushIdService {

    //根据工号查找client_id
    PushId findByCode(String code) throws Exception;

    //新增 工号 —— client_id 信息
    void save(PushId pushId) throws Exception;

    //根据工号删除重复记录
    void removeByCode(String code) throws Exception;

    //根据工号更新 工号 —— client_id 信息
    void updateByCode(String code, PushId pushId);

}
