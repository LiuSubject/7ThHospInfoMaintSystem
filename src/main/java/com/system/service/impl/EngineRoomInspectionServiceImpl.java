package com.system.service.impl;

import com.system.mapper.EngineRoomInspectionMapper;
import com.system.mapper.EngineRoomInspectionMapperCustom;
import com.system.mapper.PushMessageMapper;
import com.system.mapper.PushMessageMapperCustom;
import com.system.po.*;
import com.system.service.EngineRoomInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：EngineRoomInspectionServiceImpl
 * 类描述：EngineRoomInspection机房巡检表Service层具体实现
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Service
public class EngineRoomInspectionServiceImpl implements EngineRoomInspectionService {

    //使用spring 自动注入
    @Autowired
    private EngineRoomInspectionMapperCustom engineRoomInspectionMapperCustom;

    @Autowired
    private EngineRoomInspectionMapper engineRoomInspectionMapper;

    @Autowired
    private PushMessageMapper pushMessageMapper;

    @Autowired
    private PushMessageMapperCustom pushMessageMapperCustom;

    public void updataById(Integer id, EngineRoomInspectionCustom EngineRoomInspectionCustom) throws Exception {
        engineRoomInspectionMapper.updateByPrimaryKey(EngineRoomInspectionCustom);
    }

    public void removeById(Integer id) throws Exception {
        engineRoomInspectionMapper.deleteByPrimaryKey(id);
    }

    public List<EngineRoomInspectionCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<EngineRoomInspectionCustom> list = engineRoomInspectionMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public Boolean save(EngineRoomInspectionCustom EngineRoomInspectionCustoms) throws Exception {
        EngineRoomInspection stu = engineRoomInspectionMapper.selectByPrimaryKey(EngineRoomInspectionCustoms.getId());
        if (stu == null) {
            engineRoomInspectionMapper.insert(EngineRoomInspectionCustoms);
            return true;
        }

        return false;
    }

    public Boolean saveAndPre(
        EngineRoomInspectionCustom engineRoomInspectionCustom, PushMessage preMessage
        ) throws Exception{
        EngineRoomInspection stu = engineRoomInspectionMapper.selectByPrimaryKey(engineRoomInspectionCustom.getId());
        if (stu == null) {
            engineRoomInspectionMapper.insert(engineRoomInspectionCustom);
            pushMessageMapper.insert(preMessage);
            return true;
        }

        return false;
    }
    //返回物资申购总数
    public int getCountEngineRoomInspection() throws Exception {
        //自定义查询对象
        EngineRoomInspectionExample EngineRoomInspectionExample = new EngineRoomInspectionExample();
        //通过criteria构造查询条件
        EngineRoomInspectionExample.Criteria criteria = EngineRoomInspectionExample.createCriteria();
        criteria.andUseridIsNotNull();

        return engineRoomInspectionMapper.countByExample(EngineRoomInspectionExample);
    }

    public EngineRoomInspectionCustom findById(Integer id) throws Exception {

        EngineRoomInspection EngineRoomInspection  = engineRoomInspectionMapper.selectByPrimaryKey(id);
        EngineRoomInspectionCustom EngineRoomInspectionCustom = null;
        if (EngineRoomInspection != null) {
            EngineRoomInspectionCustom = new EngineRoomInspectionCustom();
            //类拷贝
            org.springframework.beans.BeanUtils.copyProperties(EngineRoomInspection, EngineRoomInspectionCustom);
        }

        return EngineRoomInspectionCustom;
    }

    //模糊查询
    public List<EngineRoomInspectionCustom> findByExaminer(String examiner) throws Exception {

        EngineRoomInspectionExample EngineRoomInspectionExample = new EngineRoomInspectionExample();
        //自定义查询条件
        EngineRoomInspectionExample.Criteria criteria = EngineRoomInspectionExample.createCriteria();

        criteria.andExaminerLike("%" + examiner + "%");
        EngineRoomInspectionExample.setOrderByClause("flag asc, date desc");

        List<EngineRoomInspection> list = engineRoomInspectionMapper.selectByExample(EngineRoomInspectionExample);

        List<EngineRoomInspectionCustom> EngineRoomInspectionCustomList = null;

        if (list != null) {
            EngineRoomInspectionCustomList = new ArrayList<EngineRoomInspectionCustom>();
            for (EngineRoomInspection s : list) {
                EngineRoomInspectionCustom EngineRoomInspectionCustom = new EngineRoomInspectionCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(s, EngineRoomInspectionCustom);
                EngineRoomInspectionCustomList.add(EngineRoomInspectionCustom);
            }
        }

        return EngineRoomInspectionCustomList;
    }

}
