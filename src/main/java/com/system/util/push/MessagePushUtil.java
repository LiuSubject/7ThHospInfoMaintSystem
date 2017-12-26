package com.system.util.push;

import com.system.po.PushId;
import com.system.po.PushMessage;
import com.system.po.Role;
import com.system.service.PushIdService;
import com.system.service.PushMessageService;
import com.system.service.RoleService;
import com.system.service.ViewEmployeeMiPsdService;
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

    //以单个用户方式为指定用户组推送简单消息
    public boolean GroupPushSingle(String userGroup) throws Exception{
        //拼接推送消息表内标识为未推送的第一条消息
        PushMessage pushMessage = messageStitchUtil.MessageStitch();
        List<String> clientIds = new ArrayList<String>();
        clientIds = GetPushIds(userGroup);
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
                pushMessage.setPushStatus("1");
                pushMessageService.updateById(pushMessage.getId(),pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return true;
    }

    //获取用户组推送标识集合
    public List<String> GetPushIds(String userGroup) throws Exception{
        List<Role> pushGroup = new ArrayList<Role>();
        List<String> clientIds = new ArrayList<>();
        try {
            pushGroup = roleService.findByRoleName(userGroup);

            if (pushGroup.size() > 0){
                for(int i = 0; i < pushGroup.size(); i++){
                    PushId pushId = pushIdService.findByCode(pushGroup.get(i).getRoleid());
                    clientIds.add(pushId.getClientId().toString());
                }
                return clientIds;
            }else{
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //获取用户组推送标识集合
    public String GetPushId(String code) throws Exception{
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
    public boolean SpecifiedPushSingle(String code) throws Exception{
        //拼接推送消息表内标识为未推送的第一条消息
        PushMessage pushMessage = messageStitchUtil.MessageStitch(code);
        String clientId = GetPushId(code);
        try {
            PushSingleUtil.push(clientId, pushMessage);
            pushMessage.setPushStatus("1");
            pushMessageService.updateById(pushMessage.getId(),pushMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
