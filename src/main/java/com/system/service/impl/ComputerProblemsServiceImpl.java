package com.system.service.impl;

import com.system.mapper.CollegeMapper;
import com.system.mapper.ComputerProblemsMapper;
import com.system.mapper.ComputerProblemsMapperCustom;
import com.system.po.*;
import com.system.service.ComputerProblemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
@Service
public class ComputerProblemsServiceImpl implements ComputerProblemsService {

    //使用spring 自动注入
    @Autowired
    private ComputerProblemsMapperCustom ComputerProblemsMapperCustom;

    @Autowired
    private ComputerProblemsMapper ComputerProblemsMapper;

    @Autowired
    private CollegeMapper collegeMapper;

    public void updataById(Integer id, ComputerProblemsCustom ComputerProblemsCustom) throws Exception {
        ComputerProblemsMapper.updateByPrimaryKey(ComputerProblemsCustom);
    }

    public void removeById(Integer id) throws Exception {
        ComputerProblemsMapper.deleteByPrimaryKey(id);
    }

    public List<ComputerProblemsCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<ComputerProblemsCustom> list = ComputerProblemsMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public Boolean save(ComputerProblemsCustom ComputerProblemsCustoms) throws Exception {
        ComputerProblems stu = ComputerProblemsMapper.selectByPrimaryKey(ComputerProblemsCustoms.getId());
        if (stu == null) {
            ComputerProblemsMapper.insert(ComputerProblemsCustoms);
            return true;
        }

        return false;
    }

    //返回学生总数
    public int getCountComputerProblems() throws Exception {
        //自定义查询对象
        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //通过criteria构造查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();
        criteria.andUseridIsNotNull();

        return ComputerProblemsMapper.countByExample(ComputerProblemsExample);
    }

    public ComputerProblemsCustom findById(Integer id) throws Exception {

        ComputerProblems ComputerProblems  = ComputerProblemsMapper.selectByPrimaryKey(id);
        ComputerProblemsCustom ComputerProblemsCustom = null;
        if (ComputerProblems != null) {
            ComputerProblemsCustom = new ComputerProblemsCustom();
            //类拷贝
            org.springframework.beans.BeanUtils.copyProperties(ComputerProblems, ComputerProblemsCustom);
        }

        return ComputerProblemsCustom;
    }

    //模糊查询
    public List<ComputerProblemsCustom> findByDept(String dept) throws Exception {

        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //自定义查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();

        criteria.andDeptLike("%" + dept + "%");

        List<ComputerProblems> list = ComputerProblemsMapper.selectByExample(ComputerProblemsExample);

        List<ComputerProblemsCustom> ComputerProblemsCustomList = null;

        if (list != null) {
            ComputerProblemsCustomList = new ArrayList<ComputerProblemsCustom>();
            for (ComputerProblems s : list) {
                ComputerProblemsCustom ComputerProblemsCustom = new ComputerProblemsCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, ComputerProblemsCustom);
                ComputerProblemsCustomList.add(ComputerProblemsCustom);
            }
        }

        return ComputerProblemsCustomList;
    }

    //模糊查询
    public List<ComputerProblemsCustom> findByName(String name) throws Exception {

        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //自定义查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();

        criteria.andNameLike("%" + name + "%");

        List<ComputerProblems> list = ComputerProblemsMapper.selectByExample(ComputerProblemsExample);

        List<ComputerProblemsCustom> ComputerProblemsCustomList = null;

        if (list != null) {
            ComputerProblemsCustomList = new ArrayList<ComputerProblemsCustom>();
            for (ComputerProblems s : list) {
                ComputerProblemsCustom ComputerProblemsCustom = new ComputerProblemsCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, ComputerProblemsCustom);
                ComputerProblemsCustomList.add(ComputerProblemsCustom);
            }
        }

        return ComputerProblemsCustomList;
    }

    //模糊查询
    public List<ComputerProblemsCustom> findByFlag(Integer flag) throws Exception {

        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //自定义查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();

        criteria.andFlagEqualTo(flag );

        List<ComputerProblems> list = ComputerProblemsMapper.selectByExample(ComputerProblemsExample);

        List<ComputerProblemsCustom> ComputerProblemsCustomList = null;

        if (list != null) {
            ComputerProblemsCustomList = new ArrayList<ComputerProblemsCustom>();
            for (ComputerProblems s : list) {
                ComputerProblemsCustom ComputerProblemsCustom = new ComputerProblemsCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, ComputerProblemsCustom);
                ComputerProblemsCustomList.add(ComputerProblemsCustom);
            }
        }

        return ComputerProblemsCustomList;
    }
}
