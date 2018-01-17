package com.system.util.push;

import com.system.po.PushMessage;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：CreatePushMessage
 * 类描述：创建个推消息工具类（保存记录相关数据以便产生推送)
 * 创建人：lxk
 * 创建时间：2017-12-16 10:09
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Component
public class CreatePushUtil {


    //创建初始个推消息
    public PushMessage CreatePreMessage(String founder, String pushWay, String msgType, String msgTarget, String msgContent1){
        //推送状态为0（未发送）
        String PUSHSTATUS = "0";

        PushMessage pushMessage = new PushMessage();
        pushMessage.setFounder(founder);
        pushMessage.setPushStatus(PUSHSTATUS);
        pushMessage.setPushWay(pushWay);
        pushMessage.setMsgType(msgType);
        pushMessage.setMsgTarget(msgTarget);
        pushMessage.setMsgContent1(msgContent1);
        String createCode = getRandomString(6);
        pushMessage.setCreateCode(createCode);

        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        pushMessage.setCreateTime(dateString);

        return pushMessage;
    }

    //产生随机字符串作为消息标识
    public static String getRandomString(int length){
        //定义一个字符串（A-Z，a-z，0-9）即62位；
        String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        //由Random生成随机数
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        //长度为几就循环几次
        for(int i=0; i<length; ++i){
            //产生0-61的数字
            int number=random.nextInt(62);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }
        //将承载的字符转换成字符串
        return sb.toString();
    }

}
