package com.system.util.push;

import com.system.controller.mobile.MobileAdminController;
import com.system.po.PushId;
import com.system.po.PushMessage;
import com.system.po.Role;
import com.system.service.PushIdService;
import com.system.service.PushMessageService;
import com.system.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MessagePushUtil
 * 类描述：消息推送工具类(发布推送消息)
 * 创建人：lxk
 * 创建时间：2017-12-16 10:14
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MessagePushUtil {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushIdServiceImpl")
    private PushIdService pushIdService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushMessageServiceImpl")
    private PushMessageService pushMessageService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

    @Autowired
    private PushSingleUtil pushSingleUtil;

    @Autowired
    private MessageStitchUtil messageStitchUtil;

    //以单个推送方式为指定单个用户组循环推送简单消息
    public boolean groupPushSingle(PushMessage prePushMessage, String userGroup) throws Exception{
        //拼接推送消息
        PushMessage pushMessage = messageStitchUtil.messageStitch(prePushMessage);
        List<String> clientIds = new ArrayList<String>();
        clientIds = getPushIds(userGroup);
        if(clientIds.size()>0){
            for(int i = 0; i < clientIds.size(); i++){
                String clientId = clientIds.get(i);
                try {
                    PushSingleUtil.push(clientId, pushMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                //写操作
                pushMessageService.updateByCreateCode(pushMessage.getCreateCode(),pushMessage);

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return true;
    }

    //以单个推送方式为指定多个用户组循环推送简单消息
    public boolean groupsPushSingle(PushMessage prePushMessage, String[] userGroups) throws Exception{
        //拼接推送消息
        PushMessage pushMessage = messageStitchUtil.messageStitch(prePushMessage);
        List<String> clientIds = new ArrayList<String>();
        clientIds = getPushIds(userGroups);
        if(clientIds.size()>0){
            for(int i = 0; i < clientIds.size(); i++){
                String clientId = clientIds.get(i);
                try {
                    PushSingleUtil.push(clientId, pushMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                //写操作
                pushMessageService.updateByCreateCode(pushMessage.getCreateCode(),pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    //以单个推送方式为多个用户群（多个ID+多个组混合）循环推送简单消息
    public boolean blendPushSingle(PushMessage prePushMessage,String[] blend) throws Exception{
        List<String> clientIds = new ArrayList<String>();
        for(int i = 0;i < blend.length; i++){
            try {
                int singleClientId = Integer.parseInt(blend[i]);
                clientIds.add(String.valueOf(singleClientId));
            } catch (NumberFormatException e) {
                clientIds.addAll(getPushIds(blend[i]));
            }
            clientIds.addAll(getPushIds(blend[i]));
        }
        //拼接推送消息
        PushMessage pushMessage = messageStitchUtil.messageStitch(prePushMessage);
        if(clientIds.size()>0){
            for(int i = 0; i < clientIds.size(); i++){
                String clientId = clientIds.get(i);
                try {
                    PushSingleUtil.push(clientId, pushMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                //写操作
                pushMessageService.updateByCreateCode(pushMessage.getCreateCode(),pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    //获取单个用户组推送标识集合
    public List<String> getPushIds(String userGroup) throws Exception{
        List<Role> pushGroup = new ArrayList<Role>();
        List<String> clientIds = new ArrayList<>();
        try {
            pushGroup = roleService.findByRoleName(userGroup);

            if (pushGroup.size() > 0){
                for(int i = 0; i < pushGroup.size(); i++){
                    try {
                        PushId pushId = pushIdService.findByCode(pushGroup.get(i).getRoleid());
                        clientIds.add(pushId.getClientId().toString());
                    } catch (Exception e) {
                        System.out.println("This user never use mobile :" + pushGroup.get(i).getRoleid());
                        //获取日志记录器，这个记录器将负责控制日志信息
                        Logger logger = Logger.getLogger(MessagePushUtil.class.getName());
                        logger.error("This user never use mobile :" + pushGroup.get(i).getRoleid(),e);
                    }
                }
                return clientIds;
            }else{
                return clientIds;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return clientIds;
        }
    }

    //获取多个用户组推送标识集合
    public List<String> getPushIds(String[] userGroups) throws Exception{
        List<Role> pushGroup = new ArrayList<Role>();
        List<String> clientIds = new ArrayList<>();
        try {
            for(int i = 0;i < userGroups.length; i++){
                clientIds.addAll(getPushIds(userGroups[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return clientIds;
        }
        return clientIds;
    }

    //获取用户组推送标识集合
    public String getPushId(String code) throws Exception{
        PushId pushId = null;
        try {
            pushId = pushIdService.findByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pushId.getClientId();
    }

    //为指定用户推送简单消息
    public boolean specifiedPushSingle(PushMessage prePushMessage, String code) throws Exception{
        //拼接推送消息表内标识为未推送的第一条消息
        PushMessage pushMessage = messageStitchUtil.messageStitch(prePushMessage);
        String clientId = getPushId(code);
        try {
            PushSingleUtil.push(clientId, pushMessage);
            //写操作
            pushMessageService.updateByCreateCode(pushMessage.getCreateCode(),pushMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
