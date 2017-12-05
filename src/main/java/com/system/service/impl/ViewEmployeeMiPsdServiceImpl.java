package com.system.service.impl;

import com.system.mapper.UserloginMapper;
import com.system.mapper.ViewEmployeeMiPsdMapper;
import com.system.po.ViewEmployeeMiPsd;
import com.system.po.ViewEmployeeMiPsdExample;
import com.system.po.ViewEmployeeMiPsd;
import com.system.service.ViewEmployeeMiPsdService;
import com.system.service.ViewEmployeeMiPsdService;
import com.system.util.CustomerContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ViewEmployeeMiPsdServiceImpl
 * 类描述：ViewEmployeeMiPsd登录表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class ViewEmployeeMiPsdServiceImpl implements ViewEmployeeMiPsdService {


    @Autowired
    private ViewEmployeeMiPsdMapper viewEmployeeMiPsdMapper;


    public ViewEmployeeMiPsd findByName(String name) throws Exception {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MSSQL);
        ViewEmployeeMiPsdExample viewEmployeeMiPsdExample = new ViewEmployeeMiPsdExample();

        ViewEmployeeMiPsdExample.Criteria criteria = viewEmployeeMiPsdExample.createCriteria();
        criteria.andNameEqualTo(name);

        List<ViewEmployeeMiPsd> list = viewEmployeeMiPsdMapper.selectByExample(viewEmployeeMiPsdExample);
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        return list.get(0);
    }

    public ViewEmployeeMiPsd findByCode(String code) throws Exception {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MSSQL);
        ViewEmployeeMiPsdExample viewEmployeeMiPsdExample = new ViewEmployeeMiPsdExample();

        ViewEmployeeMiPsdExample.Criteria criteria = viewEmployeeMiPsdExample.createCriteria();
        criteria.andCodeEqualTo(code);

        List<ViewEmployeeMiPsd> list = viewEmployeeMiPsdMapper.selectByExample(viewEmployeeMiPsdExample);
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        return list.get(0);
    }

    public void save(ViewEmployeeMiPsd viewEmployeeMiPsd) throws Exception {
        viewEmployeeMiPsdMapper.insert(viewEmployeeMiPsd);
    }

    public void removeByName(String name) throws Exception {
        ViewEmployeeMiPsdExample viewEmployeeMiPsdExample = new ViewEmployeeMiPsdExample();

        ViewEmployeeMiPsdExample.Criteria criteria = viewEmployeeMiPsdExample.createCriteria();
        criteria.andNameEqualTo(name);

        viewEmployeeMiPsdMapper.deleteByExample(viewEmployeeMiPsdExample);
    }

    public void updateByName(String name, ViewEmployeeMiPsd viewEmployeeMiPsd) {
        ViewEmployeeMiPsdExample viewEmployeeMiPsdExample = new ViewEmployeeMiPsdExample();

        ViewEmployeeMiPsdExample.Criteria criteria = viewEmployeeMiPsdExample.createCriteria();
        criteria.andNameEqualTo(name);

        viewEmployeeMiPsdMapper.updateByExample(viewEmployeeMiPsd, viewEmployeeMiPsdExample);
    }

}
