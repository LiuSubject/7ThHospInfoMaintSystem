package com.system.service;

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

    //查找未发送个推消息(群发用)
    PushMessage findByStatus(String status) throws Exception;

    //查找未发送个推消息(指定用户)
    PushMessage findSpecifiedByStatus(String status,String code) throws Exception;

    //新增个推消息
    void save(PushMessage pushMessage) throws Exception;

    //根据主键删除指定个推消息
    void removeById(int id) throws Exception;

    //根据主键更新指定个推消息
    void updateById(int id, PushMessage pushMessage);



}
