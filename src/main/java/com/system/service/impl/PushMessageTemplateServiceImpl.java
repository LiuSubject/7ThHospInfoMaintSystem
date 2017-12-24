package com.system.service.impl;

import com.system.mapper.PushIdMapper;
import com.system.mapper.PushMessageMapper;
import com.system.mapper.PushMessageTemplateMapper;
import com.system.po.*;
import com.system.service.PushIdService;
import com.system.service.PushMessageTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushMessageTemplateServiceImpl
 * 类描述：PushMessageTemplate个推消息模板表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class PushMessageTemplateServiceImpl implements PushMessageTemplateService {
    @Autowired
    private PushMessageTemplateMapper pushMessageTemplateMapper;


    public PushMessageTemplate findById(int Id) throws Exception {
        PushMessageTemplateExample pushMessageTemplateExample = new PushMessageTemplateExample();

        PushMessageTemplateExample.Criteria criteria = pushMessageTemplateExample.createCriteria();
        criteria.andIdEqualTo(Id);

        List<PushMessageTemplate> list = pushMessageTemplateMapper.selectByExample(pushMessageTemplateExample);
        if(list.size() > 0){
            return list.get(0);
        }else
        {
            return null;
        }
    }

}
