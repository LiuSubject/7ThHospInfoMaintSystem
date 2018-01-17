package com.system.service;

import com.system.po.PushMessageTemplate;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushMessageTemplateService
 * 类描述：PushMessageTemplate推送消息模板表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-15 15:54:33
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface PushMessageTemplateService {

    //查找指定个推消息模板
    PushMessageTemplate findById(int Id) throws Exception;

}
