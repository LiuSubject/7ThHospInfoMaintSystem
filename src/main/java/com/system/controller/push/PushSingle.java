package com.system.controller.push;

import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.base.payload.APNPayload;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.TransmissionTemplate;
import com.gexin.rp.sdk.base.impl.Target;

import java.io.IOException;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushSingle
 * 类描述：对单个用户推送消息。
 *        如果仅对单个用户推送务必使用单推接口，否则会严重影响推送性能，
 *        如果对少量甚至几个用户推送同样的消息，同样建议使用单推实现，性能会更高。
 * 创建人：lxk
 * 创建时间：2017-12-15 9:50
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class PushSingle {
    //定义常量, appId、appKey、masterSecret(个推-开发者中心中获得的应用配置)
    private static String appId = "lraFkpXwtL86ABCwBevQh2";
    private static String appKey = "AeSJwsMUfi9bE95wZlrVm2";
    private static String masterSecret = "EjSozOizgq9I7aKGEHfw81";
    private static String pushText="";/*{title:'通知标题',content:'通知内容',payload:'通知去干嘛这里可以自定义'}*/
    public static String cid = "";

    //向个推服务器发送请求
    public static void push(String cid) throws IOException {
        IGtPush push = new IGtPush(appKey, masterSecret);
        push.connect();

        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(4 * 3600 * 1000);
        //推送内容，格式为{title:'通知标题',content:'通知内容',payload:'通知去干嘛这里可以自定义'}
        message.setData(getTemplate());
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);


        Target target = new Target();
        target.setAppId(appId);
        target.setClientId(cid);

        IPushResult ret = push.pushMessageToSingle(message,target);
        System.out.println(ret.getResponse().toString());
    }
    //生成推送消息
    public static TransmissionTemplate getTemplate() {
        TransmissionTemplate template = new TransmissionTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        template.setTransmissionContent(pushText);
        template.setTransmissionType(2);
        APNPayload payload = new APNPayload();
        //payload.setBadge(0);
        payload.setContentAvailable(1);
        payload.setSound("default");
        payload.setCategory("$由客户端定义");
        String content=pushText.substring(pushText.indexOf(",content:'")+",content:'".length(),pushText.indexOf("',payload:"));
        //简单模式APNPayload.SimpleMsg
        payload.setAlertMsg(new APNPayload.SimpleAlertMsg(content));
        template.setAPNInfo(payload);
        return template;
    }
}
