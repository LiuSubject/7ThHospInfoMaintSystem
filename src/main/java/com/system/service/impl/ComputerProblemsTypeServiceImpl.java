package com.system.service.impl;

import com.system.mapper.*;
import com.system.po.*;
import com.system.service.ComputerProblemsService;
import com.system.service.ComputerProblemsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsServiceImpl
 * 类描述：ComputerProblems电脑故障表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Service
public class ComputerProblemsTypeServiceImpl implements ComputerProblemsTypeService {

    //使用spring 自动注入
    @Autowired
    private ComputerProblemsTypeMapper computerProblemsTypeMapper;

    public List<ComputerProblemsType> getAll(){
        List<ComputerProblemsType> computerProblemsTypeList = new ArrayList<>();
        ComputerProblemsTypeExample computerProblemsTypeExample = new ComputerProblemsTypeExample();
        ComputerProblemsTypeExample.Criteria criteria = computerProblemsTypeExample.createCriteria();
        criteria.andIdIsNotNull();
        computerProblemsTypeList = computerProblemsTypeMapper.selectByExample(computerProblemsTypeExample);
        return computerProblemsTypeList;
    }

    public List<ComputerProblemsType> getSecondaryList(String mainType){
        List<ComputerProblemsType> computerProblemsTypeList = new ArrayList<>();
        ComputerProblemsTypeExample computerProblemsTypeExample = new ComputerProblemsTypeExample();
        ComputerProblemsTypeExample.Criteria criteria = computerProblemsTypeExample.createCriteria();
        criteria.andIdIsNotNull().andTypeCodeEqualTo(mainType);
        computerProblemsTypeList = computerProblemsTypeMapper.selectByExample(computerProblemsTypeExample);
        return computerProblemsTypeList;
    }

}
