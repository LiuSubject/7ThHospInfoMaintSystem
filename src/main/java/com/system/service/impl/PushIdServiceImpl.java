package com.system.service.impl;

import com.system.mapper.PushIdMapper;
import com.system.mapper.PushIdMapper;
import com.system.po.PushId;
import com.system.po.PushId;
import com.system.po.PushIdExample;
import com.system.service.PushIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：PushIdServiceImpl
 * 类描述：PushId登录表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class PushIdServiceImpl implements PushIdService {


    @Autowired
    private PushIdMapper pushIdMapper;


    public PushId findByCode(String code) throws Exception {
        PushIdExample pushIdExample = new PushIdExample();

        PushIdExample.Criteria criteria = pushIdExample.createCriteria();
        criteria.andCodeEqualTo(code);

        List<PushId> list = pushIdMapper.selectByExample(pushIdExample);
        if(list.size() > 0){
            return list.get(0);
        }else
        {
            return null;
        }
    }

    public void save(PushId pushId) throws Exception {
        pushIdMapper.insert(pushId);
    }

    public void removeByCode(String code) throws Exception {
        PushIdExample pushIdExample = new PushIdExample();

        PushIdExample.Criteria criteria = pushIdExample.createCriteria();
        criteria.andCodeEqualTo(code);

        pushIdMapper.deleteByExample(pushIdExample);
    }

    public void updateByCode(String code, PushId pushId) {
        PushIdExample pushIdExample = new PushIdExample();

        PushIdExample.Criteria criteria = pushIdExample.createCriteria();
        criteria.andCodeEqualTo(code);

        pushIdMapper.updateByExample(pushId, pushIdExample);
    }

}
