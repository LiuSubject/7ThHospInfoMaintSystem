package com.system.service;

import com.system.po.PushId;
import com.system.po.PushMessage;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushMessageService
 * 类描述：PushMessage推送消息表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-15 15:54:33
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface PushMessageService {

    //根据工号查找client_id
    PushMessage findByCode(String code) throws Exception;

    //新增 工号 —— client_id 信息
    void save(PushMessage pushMessage) throws Exception;

    //根据工号删除重复记录
    void removeByCode(String code) throws Exception;

    //根据工号更新 工号 —— client_id 信息
    void updateByCode(String code, PushMessage pushMessage);

}
