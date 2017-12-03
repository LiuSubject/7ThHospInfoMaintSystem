package com.system.service.impl;

import com.system.mapper.EngineRoomInspectionMapper;
import com.system.mapper.EngineRoomInspectionMapperCustom;
import com.system.po.EngineRoomInspection;
import com.system.po.EngineRoomInspectionCustom;
import com.system.po.EngineRoomInspectionExample;
import com.system.po.PagingVO;
import com.system.service.EngineRoomInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
@Service
public class EngineRoomInspectionServiceImpl implements EngineRoomInspectionService {

    //使用spring 自动注入
    @Autowired
    private EngineRoomInspectionMapperCustom EngineRoomInspectionMapperCustom;

    @Autowired
    private EngineRoomInspectionMapper EngineRoomInspectionMapper;


    public void updataById(Integer id, EngineRoomInspectionCustom EngineRoomInspectionCustom) throws Exception {
        EngineRoomInspectionMapper.updateByPrimaryKey(EngineRoomInspectionCustom);
    }

    public void removeById(Integer id) throws Exception {
        EngineRoomInspectionMapper.deleteByPrimaryKey(id);
    }

    public List<EngineRoomInspectionCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<EngineRoomInspectionCustom> list = EngineRoomInspectionMapperCustom.findByPaging(pagingVO);

        return list;
    }

    public Boolean save(EngineRoomInspectionCustom EngineRoomInspectionCustoms) throws Exception {
        EngineRoomInspection stu = EngineRoomInspectionMapper.selectByPrimaryKey(EngineRoomInspectionCustoms.getId());
        if (stu == null) {
            EngineRoomInspectionMapper.insert(EngineRoomInspectionCustoms);
            return true;
        }

        return false;
    }

    //返回学生总数
    public int getCountEngineRoomInspection() throws Exception {
        //自定义查询对象
        EngineRoomInspectionExample EngineRoomInspectionExample = new EngineRoomInspectionExample();
        //通过criteria构造查询条件
        EngineRoomInspectionExample.Criteria criteria = EngineRoomInspectionExample.createCriteria();
        criteria.andUseridIsNotNull();

        return EngineRoomInspectionMapper.countByExample(EngineRoomInspectionExample);
    }

    public EngineRoomInspectionCustom findById(Integer id) throws Exception {

        EngineRoomInspection EngineRoomInspection  = EngineRoomInspectionMapper.selectByPrimaryKey(id);
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

        List<EngineRoomInspection> list = EngineRoomInspectionMapper.selectByExample(EngineRoomInspectionExample);

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
