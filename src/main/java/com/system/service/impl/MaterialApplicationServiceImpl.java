package com.system.service.impl;

import com.system.mapper.MaterialApplicationMapper;
import com.system.mapper.MaterialApplicationMapperCustom;
import com.system.po.MaterialApplication;
import com.system.po.MaterialApplicationCustom;
import com.system.po.MaterialApplicationExample;
import com.system.po.PagingVO;
import com.system.service.MaterialApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
@Service
public class MaterialApplicationServiceImpl implements MaterialApplicationService {

    //使用spring 自动注入
    @Autowired
    private MaterialApplicationMapperCustom MaterialApplicationMapperCustom;

    @Autowired
    private MaterialApplicationMapper MaterialApplicationMapper;

    public void updataById(Integer id, MaterialApplicationCustom MaterialApplicationCustom) throws Exception {
        MaterialApplicationMapper.updateByPrimaryKey(MaterialApplicationCustom);
    }

    public void removeById(Integer id) throws Exception {
        MaterialApplicationMapper.deleteByPrimaryKey(id);
    }

    public List<MaterialApplicationCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<MaterialApplicationCustom> list = MaterialApplicationMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public Boolean save(MaterialApplicationCustom MaterialApplicationCustoms) throws Exception {
        MaterialApplication stu = MaterialApplicationMapper.selectByPrimaryKey(MaterialApplicationCustoms.getId());
        if (stu == null) {
            MaterialApplicationMapper.insert(MaterialApplicationCustoms);
            return true;
        }

        return false;
    }

    //返回学生总数
    public int getCountMaterialApplication() throws Exception {
        //自定义查询对象
        MaterialApplicationExample MaterialApplicationExample = new MaterialApplicationExample();
        //通过criteria构造查询条件
        MaterialApplicationExample.Criteria criteria = MaterialApplicationExample.createCriteria();
        criteria.andUseridIsNotNull();

        return MaterialApplicationMapper.countByExample(MaterialApplicationExample);
    }

    public MaterialApplicationCustom findById(Integer id) throws Exception {

        MaterialApplication MaterialApplication  = MaterialApplicationMapper.selectByPrimaryKey(id);
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

        List<MaterialApplication> list = MaterialApplicationMapper.selectByExample(MaterialApplicationExample);

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

        List<MaterialApplication> list = MaterialApplicationMapper.selectByExample(MaterialApplicationExample);

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

        List<MaterialApplication> list = MaterialApplicationMapper.selectByExample(MaterialApplicationExample);

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
}
