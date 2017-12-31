package com.system.service.impl;

import com.system.mapper.ComputerProblemsMapper;
import com.system.mapper.ComputerProblemsMapperCustom;
import com.system.mapper.PushMessageMapper;
import com.system.mapper.PushMessageMapperCustom;
import com.system.po.*;
import com.system.service.ComputerProblemsService;
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
public class ComputerProblemsServiceImpl implements ComputerProblemsService {

    //使用spring 自动注入
    @Autowired
    private ComputerProblemsMapperCustom computerProblemsMapperCustom;

    @Autowired
    private ComputerProblemsMapper computerProblemsMapper;

    @Autowired
    private PushMessageMapper pushMessageMapper;

    @Autowired
    private PushMessageMapperCustom pushMessageMapperCustom;


    public void updataById(Integer id, ComputerProblemsCustom ComputerProblemsCustom) throws Exception {
        computerProblemsMapper.updateByPrimaryKey(ComputerProblemsCustom);
    }

    public void removeById(Integer id) throws Exception {
        computerProblemsMapper.deleteByPrimaryKey(id);
    }

    public List<ComputerProblemsCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<ComputerProblemsCustom> list = computerProblemsMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public List<ComputerProblemsCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception {

        List<ComputerProblemsCustom> list = computerProblemsMapperCustom.paginationOfSearchResults(condition);

        return list;
    }

    public Boolean save(ComputerProblemsCustom ComputerProblemsCustoms) throws Exception {
        ComputerProblems stu = computerProblemsMapper.selectByPrimaryKey(ComputerProblemsCustoms.getId());
        if (stu == null) {
            computerProblemsMapper.insert(ComputerProblemsCustoms);
            return true;
        }

        return false;
    }

    @Transactional
    public Boolean saveAndPre(ComputerProblemsCustom computerProblemsCustom, PushMessage preMessage) throws Exception{
        ComputerProblems stu = computerProblemsMapper.selectByPrimaryKey(computerProblemsCustom.getId());
        if (stu == null) {
            computerProblemsMapper.insert(computerProblemsCustom);
            pushMessageMapper.insert(preMessage);
            return true;
        }

        return false;
    }


    //返回总数
    public int getCountComputerProblems() throws Exception {
        //自定义查询对象
        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //通过criteria构造查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();
        criteria.andUseridIsNotNull();

        return computerProblemsMapper.countByExample(ComputerProblemsExample);
    }

    //返回查询总数
    public int getCountOfSearchResults() throws Exception {
        //自定义查询对象
        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //通过criteria构造查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();
        criteria.andUseridIsNotNull();

        return computerProblemsMapper.countByExample(ComputerProblemsExample);
    }

    public ComputerProblemsCustom findById(Integer id) throws Exception {

        ComputerProblems ComputerProblems  = computerProblemsMapper.selectByPrimaryKey(id);
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
        ComputerProblemsExample.setOrderByClause("flag asc, create_time desc");
        List<ComputerProblems> list = computerProblemsMapper.selectByExample(ComputerProblemsExample);

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
        ComputerProblemsExample.setOrderByClause("flag asc, create_time desc");

        List<ComputerProblems> list = computerProblemsMapper.selectByExample(ComputerProblemsExample);

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
        ComputerProblemsExample.setOrderByClause("flag asc");

        List<ComputerProblems> list = computerProblemsMapper.selectByExample(ComputerProblemsExample);

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
    public List<ComputerProblemsCustom> findByUserID(String code) throws Exception {

        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //自定义查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();

        criteria.andUseridEqualTo(code);
        ComputerProblemsExample.setOrderByClause("flag asc, create_time desc");

        List<ComputerProblems> list = computerProblemsMapper.selectByExample(ComputerProblemsExample);

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
    public List<ComputerProblemsCustom> findByLeader(String code) throws Exception {

        ComputerProblemsExample ComputerProblemsExample = new ComputerProblemsExample();
        //自定义查询条件
        ComputerProblemsExample.Criteria criteria = ComputerProblemsExample.createCriteria();

        criteria.andLeaderEqualTo(code);
        ComputerProblemsExample.setOrderByClause("flag asc, create_time desc");

        List<ComputerProblems> list = computerProblemsMapper.selectByExample(ComputerProblemsExample);

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
