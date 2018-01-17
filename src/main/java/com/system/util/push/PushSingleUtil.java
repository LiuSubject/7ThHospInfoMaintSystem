package com.system.util.push;

import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.exceptions.RequestException;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.NotificationTemplate;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.template.style.Style0;
import com.system.po.PushMessage;

import java.io.IOException;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushSingleUtil
 * 类描述：推送消息工具类（单个用户）
 *        如果仅对单个用户推送务必使用单推接口，否则会严重影响推送性能，
 *        如果对少量甚至几个用户推送同样的消息，同样建议使用单推实现，性能会更高。
 * 创建人：lxk
 * 创建时间：2017-12-15 9:50
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class PushSingleUtil {



    //定义常量, appId、appKey、masterSecret(个推-开发者中心中获得的应用配置)
    private static String appId = "lraFkpXwtL86ABCwBevQh2";
    private static String appKey = "kFNQ7bt1Ty9CZdVlzkKPm4";
    private static String masterSecret = "EjSozOizgq9I7aKGEHfw81";

    //向个推服务器发送单条请求
    public static void push(String cid, PushMessage pushMessage) throws IOException {
        IGtPush push = new IGtPush(appKey, masterSecret);
        push.connect();

        SingleMessage message = new SingleMessage();
        message.setOffline(true);
        // 离线有效时间，单位为毫秒，可选
        message.setOfflineExpireTime(4 * 3600 * 1000);
        //推送内容，格式为{title:'通知标题',content:'通知内容',payload:'通知去干嘛这里可以自定义'}
        message.setData(getTemplate(pushMessage));
        // 可选，1为wifi，0为不限制网络环境。根据手机处于的网络情况，决定是否下发
        message.setPushNetWorkType(0);
        //创建推送目标
        Target target = new Target();
        target.setAppId(appId);
        target.setClientId(cid);
        //推送并返回结果
        IPushResult ret = null;
        try {
            ret = push.pushMessageToSingle(message, target);
        } catch (RequestException e) {
            e.printStackTrace();
            ret = push.pushMessageToSingle(message, target, e.getRequestId());
        }
        if (ret != null) {
            System.out.println(ret.getResponse().toString());
        } else {
            System.out.println("服务器响应异常");
        }
    }
    //生成推送消息(透传消息)
/*    public static TransmissionTemplate getTemplate(PushMessage pushMessage) {
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
    }*/

    //生成推送消息(简单提醒，只激活应用，无后续动作)
    public static NotificationTemplate getTemplate(PushMessage pushMessage) {
        NotificationTemplate template = new NotificationTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
/*      template.setTransmissionContent(pushMessage.getMsgContent1());
        template.setTransmissionType(2);
        // 设置定时展示时间
        // template.setDuration("2015-01-16 11:40:00", "2015-01-16 12:24:00");
        return template;*/
        template.setTransmissionType(1);
        //template.setTransmissionContent("请输入您要透传的内容");
        // 设置定时展示时间
        // template.setDuration("2015-01-16 11:40:00", "2015-01-16 12:24:00");

        Style0 style = new Style0();
        // 设置通知栏标题与内容
        style.setTitle("信息维护");
        style.setText(pushMessage.getMsgContent1());
        // 配置通知栏图标
        style.setLogo("icon.png");
        // 配置通知栏网络图标
        //style.setLogoUrl("");
        // 设置通知是否响铃，震动，或者可清除
        style.setRing(true);
        style.setVibrate(true);
        style.setClearable(true);
        template.setStyle(style);

        return template;
    }
}
