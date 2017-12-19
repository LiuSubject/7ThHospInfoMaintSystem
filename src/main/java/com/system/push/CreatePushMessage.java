package com.system.push;

import com.mchange.v2.c3p0.util.TestUtils;
import com.system.po.PushMessage;
import com.system.service.ComputerProblemsService;
import com.system.service.PushMessageService;
import com.system.service.impl.PushMessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：CreatePushMessage
 * 类描述：创建个推消息
 * 创建人：lxk
 * 创建时间：2017-12-16 10:09
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Component
public class CreatePushMessage {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushMessageServiceImpl")
    private PushMessageService pushMessageService;

    private static CreatePushMessage createPushMessage2;

    @PostConstruct
    public void init() {
        createPushMessage2 = this;
    }

    //创建个推消息1
    public boolean GetPushMessage(String founder, String pushWay, String msgType, String msgTarget, String msgContent1){
        //推送状态为0（未发送）
        String PUSHSTATUS = "0";
        PushMessage pushMessage = new PushMessage();
        pushMessage.setFounder(founder);
        pushMessage.setPushStatus(PUSHSTATUS);
        pushMessage.setPushWay(pushWay);
        pushMessage.setMsgType(msgType);
        pushMessage.setMsgTarget(msgTarget);
        pushMessage.setMsgContent1(msgContent1);

        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        pushMessage.setCreateTime(dateString);

        try {
            pushMessageService.save(pushMessage);
            createPushMessage2.pushMessageService.save(pushMessage);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
