package com.system.service.impl;

import com.system.mapper.*;
import com.system.po.*;
import com.system.service.MaterialApplicationService;
import com.system.service.MaterialApplicationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationServiceImpl
 * 类描述：MaterialApplication物资申购表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Service
public class MaterialApplicationTypeServiceImpl implements MaterialApplicationTypeService {

    //使用spring 自动注入
    @Autowired
    private MaterialApplicationTypeMapper materialApplicationTypeMapper;

    public List<MaterialApplicationType> getAll(){
        List<MaterialApplicationType> MaterialApplicationTypeList = new ArrayList<>();
        MaterialApplicationTypeExample materialApplicationTypeExample = new MaterialApplicationTypeExample();
        MaterialApplicationTypeExample.Criteria criteria = materialApplicationTypeExample.createCriteria();
        criteria.andIdIsNotNull();
        MaterialApplicationTypeList = materialApplicationTypeMapper.selectByExample(materialApplicationTypeExample);
        return MaterialApplicationTypeList;
    }


}
