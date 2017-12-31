package com.system.service.impl;

import com.system.mapper.MaterialApplicationMapper;
import com.system.mapper.MaterialApplicationMapperCustom;
import com.system.mapper.PushMessageMapper;
import com.system.mapper.PushMessageMapperCustom;
import com.system.po.*;
import com.system.service.MaterialApplicationService;
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
public class MaterialApplicationServiceImpl implements MaterialApplicationService {

    //使用spring 自动注入
    @Autowired
    private MaterialApplicationMapperCustom materialApplicationMapperCustom;

    @Autowired
    private MaterialApplicationMapper materialApplicationMapper;

    @Autowired
    private PushMessageMapper pushMessageMapper;

    @Autowired
    private PushMessageMapperCustom pushMessageMapperCustom;


    public void updataById(Integer id, MaterialApplicationCustom MaterialApplicationCustom) throws Exception {
        materialApplicationMapper.updateByPrimaryKey(MaterialApplicationCustom);
    }

    public void removeById(Integer id) throws Exception {
        materialApplicationMapper.deleteByPrimaryKey(id);
    }

    public List<MaterialApplicationCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<MaterialApplicationCustom> list = materialApplicationMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public Boolean save(MaterialApplicationCustom MaterialApplicationCustoms) throws Exception {
        MaterialApplication stu = materialApplicationMapper.selectByPrimaryKey(MaterialApplicationCustoms.getId());
        if (stu == null) {
            materialApplicationMapper.insert(MaterialApplicationCustoms);
            return true;
        }

        return false;
    }

    @Transactional
    public Boolean saveAndPre(MaterialApplicationCustom materialApplicationCustom, PushMessage preMessage) throws Exception{
        MaterialApplication stu = materialApplicationMapper.selectByPrimaryKey(materialApplicationCustom.getId());
        if (stu == null) {
            materialApplicationMapper.insert(materialApplicationCustom);
            pushMessageMapper.insert(preMessage);
            return true;
        }

        return false;
    }

    //返回物资申购总数
    public int getCountMaterialApplication() throws Exception {
        //自定义查询对象
        MaterialApplicationExample MaterialApplicationExample = new MaterialApplicationExample();
        //通过criteria构造查询条件
        MaterialApplicationExample.Criteria criteria = MaterialApplicationExample.createCriteria();
        criteria.andUseridIsNotNull();

        return materialApplicationMapper.countByExample(MaterialApplicationExample);
    }

    public MaterialApplicationCustom findById(Integer id) throws Exception {

        MaterialApplication MaterialApplication  = materialApplicationMapper.selectByPrimaryKey(id);
        MaterialApplicationCustom MaterialApplicationCustom = null;
        if (MaterialApplication != null) {
            MaterialApplicationCustom = new MaterialApplicationCustom();
            //类拷贝
            org.springframework.beans.BeanUtils.copyProperties(MaterialApplication, MaterialApplicationCustom);
        }

        return MaterialApplicationCustom;
    }

    //模糊查询
    public List<MaterialApplicationCustom> findByDept(String dept) throws Exception {

        MaterialApplicationExample MaterialApplicationExample = new MaterialApplicationExample();
        //自定义查询条件
        MaterialApplicationExample.Criteria criteria = MaterialApplicationExample.createCriteria();

        criteria.andDeptLike("%" + dept + "%");

        List<MaterialApplication> list = materialApplicationMapper.selectByExample(MaterialApplicationExample);

        List<MaterialApplicationCustom> MaterialApplicationCustomList = null;

        if (list != null) {
            MaterialApplicationCustomList = new ArrayList<MaterialApplicationCustom>();
            for (MaterialApplication s : list) {
                MaterialApplicationCustom MaterialApplicationCustom = new MaterialApplicationCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, MaterialApplicationCustom);
                MaterialApplicationCustomList.add(MaterialApplicationCustom);
            }
        }

        return MaterialApplicationCustomList;
    }

    //模糊查询
    public List<MaterialApplicationCustom> findByName(String name) throws Exception {

        MaterialApplicationExample MaterialApplicationExample = new MaterialApplicationExample();
        //自定义查询条件
        MaterialApplicationExample.Criteria criteria = MaterialApplicationExample.createCriteria();

        criteria.andNameLike("%" + name + "%");

        List<MaterialApplication> list = materialApplicationMapper.selectByExample(MaterialApplicationExample);

        List<MaterialApplicationCustom> MaterialApplicationCustomList = null;

        if (list != null) {
            MaterialApplicationCustomList = new ArrayList<MaterialApplicationCustom>();
            for (MaterialApplication s : list) {
                MaterialApplicationCustom MaterialApplicationCustom = new MaterialApplicationCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, MaterialApplicationCustom);
                MaterialApplicationCustomList.add(MaterialApplicationCustom);
            }
        }

        return MaterialApplicationCustomList;
    }

    //模糊查询
    public List<MaterialApplicationCustom> findByFlag(Integer flag) throws Exception {

        MaterialApplicationExample MaterialApplicationExample = new MaterialApplicationExample();
        //自定义查询条件
        MaterialApplicationExample.Criteria criteria = MaterialApplicationExample.createCriteria();

        criteria.andFlagEqualTo(flag );

        List<MaterialApplication> list = materialApplicationMapper.selectByExample(MaterialApplicationExample);

        List<MaterialApplicationCustom> MaterialApplicationCustomList = null;

        if (list != null) {
            MaterialApplicationCustomList = new ArrayList<MaterialApplicationCustom>();
            for (MaterialApplication s : list) {
                MaterialApplicationCustom MaterialApplicationCustom = new MaterialApplicationCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, MaterialApplicationCustom);
                MaterialApplicationCustomList.add(MaterialApplicationCustom);
            }
        }

        return MaterialApplicationCustomList;
    }

    //模糊查询
    public List<MaterialApplicationCustom> findByUserID(String code) throws Exception {

        MaterialApplicationExample materialApplicationExample = new MaterialApplicationExample();
        //自定义查询条件
        MaterialApplicationExample.Criteria criteria = materialApplicationExample.createCriteria();


        criteria.andUseridEqualTo(code);
        materialApplicationExample.setOrderByClause("flag asc");

        List<MaterialApplication> list = materialApplicationMapper.selectByExample(materialApplicationExample);

        List<MaterialApplicationCustom> MaterialApplicationCustomList = null;

        if (list != null) {
            MaterialApplicationCustomList = new ArrayList<>();
            for (MaterialApplication s : list) {
                MaterialApplicationCustom MaterialApplicationCustom = new MaterialApplicationCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, MaterialApplicationCustom);
                MaterialApplicationCustomList.add(MaterialApplicationCustom);
            }
        }

        return MaterialApplicationCustomList;
    }
}
