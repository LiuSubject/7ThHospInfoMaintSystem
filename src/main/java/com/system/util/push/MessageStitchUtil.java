package com.system.util.push;

import com.system.po.PushMessage;
import com.system.po.PushMessageTemplate;
import com.system.service.PushMessageService;
import com.system.service.PushMessageTemplateService;

import javax.annotation.Resource;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MessageStitchUtil
 * 类描述：消息拼接生成工具类
 * 创建人：lxk
 * 创建时间：2017-12-24 9:27
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MessageStitchUtil {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushMessageServiceImpl")
    private PushMessageService pushMessageService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushMessageTemplateServiceImpl")
    private PushMessageTemplateService pushMessageTemplateService;

    //自动拼接推送消息表内标识为未推送的第一条消息
    public PushMessage messageStitch(PushMessage prePushMessage){

        PushMessage pushMessage = prePushMessage;
        PushMessageTemplate pushMessageTemplate = null;
        int pushMessageTemplateId = 0;

        try {
            pushMessageTemplateId = Integer.parseInt(pushMessage.getMsgContent1());
            //只读操作
            pushMessageTemplate = pushMessageTemplateService.findById(pushMessageTemplateId);
            //导入消息模板
            pushMessage.setMsgContent1(pushMessageTemplate.getContent());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return pushMessage;
    }


}
