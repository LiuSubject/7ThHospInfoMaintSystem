package com.system.service.impl;

import com.system.mapper.PushMessageMapper;
import com.system.po.PushMessage;
import com.system.po.PushMessageExample;
import com.system.service.PushMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushMessageServiceImpl
 * 类描述：PushMessage个推消息表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-16 14:35:09
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class PushMessageServiceImpl implements PushMessageService {


    @Autowired
    private PushMessageMapper pushMessageMapper;


    public PushMessage findByStatus(String status) throws Exception {
        PushMessageExample pushMessageExample = new PushMessageExample();

        PushMessageExample.Criteria criteria = pushMessageExample.createCriteria();
        criteria.andPushStatusEqualTo(status);

        List<PushMessage> list = pushMessageMapper.selectByExample(pushMessageExample);
        if(list.size() > 0){
            return list.get(0);
        }else
        {
            return null;
        }
    }

    public void save(PushMessage pushMessage) throws Exception {
        pushMessageMapper.insert(pushMessage);
    }

    public void removeById(int id) throws Exception {
        PushMessageExample pushMessageExample = new PushMessageExample();

        PushMessageExample.Criteria criteria = pushMessageExample.createCriteria();
        criteria.andIdEqualTo(id);

        pushMessageMapper.deleteByExample(pushMessageExample);
    }

    public void updateById(int id, PushMessage pushMessage) {
        PushMessageExample pushMessageExample = new PushMessageExample();

        PushMessageExample.Criteria criteria = pushMessageExample.createCriteria();
        criteria.andIdEqualTo(id);

        pushMessageMapper.updateByExample(pushMessage, pushMessageExample);
    }

}
