package com.system.service.impl;

import com.system.mapper.*;
import com.system.po.*;
import com.system.service.SoftwareRequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：SoftwareRequirementsService
 * 类描述：SoftwareRequirements软件需求表Service层具体实现
 * 创建人：lxk
 * 创建时间：2018-02-07 16:18
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Service
public class SoftwareRequirementsServiceImpl implements SoftwareRequirementsService {

    //使用spring 自动注入
    @Autowired
    private SoftwareRequirementsCustomMapper softwareRequirementsCustomMapper;

    @Autowired
    private SoftwareRequirementsMapper softwareRequirementsMapper;

    @Autowired
    private PushMessageMapper pushMessageMapper;

    @Autowired
    private PushMessageMapperCustom pushMessageMapperCustom;

    public void updataById(Integer id, SoftwareRequirementsCustom SoftwareRequirementsCustom) throws Exception {
        softwareRequirementsMapper.updateByPrimaryKey(SoftwareRequirementsCustom);
    }

    public void removeById(Integer id) throws Exception {
        softwareRequirementsMapper.deleteByPrimaryKey(id);
    }

    public List<SoftwareRequirementsCustom> findByPaging(Integer toPageNo) throws Exception {
        PagingVO pagingVO = new PagingVO();
        pagingVO.setToPageNo(toPageNo);

        List<SoftwareRequirementsCustom> list = softwareRequirementsCustomMapper.findByPaging(pagingVO);

        return list;
    }

    public List<SoftwareRequirementsCustom> findByDpdeanPaging(Map<String, Object> map) throws Exception {

        List<SoftwareRequirementsCustom> list = softwareRequirementsCustomMapper.findByDpdeanPaging(map);

        return list;
    }

    public List<SoftwareRequirementsCustom> findByPagingOfDepart(Map<String, Object> map) throws Exception {

        List<SoftwareRequirementsCustom> list = softwareRequirementsCustomMapper.findByPagingOfDepart(map);

        return list;
    }

    public Boolean save(SoftwareRequirementsCustom SoftwareRequirementsCustoms) throws Exception {
        SoftwareRequirements stu = softwareRequirementsMapper.selectByPrimaryKey(SoftwareRequirementsCustoms.getId());
        if (stu == null) {
            softwareRequirementsMapper.insert(SoftwareRequirementsCustoms);
            return true;
        }

        return false;
    }

    public Boolean saveAndPre(
            SoftwareRequirementsCustom softwareRequirementsCustom, PushMessage preMessage
    ) throws Exception{
        SoftwareRequirements stu = softwareRequirementsMapper.selectByPrimaryKey(softwareRequirementsCustom.getId());
        if (stu == null) {
            softwareRequirementsMapper.insert(softwareRequirementsCustom);
            pushMessageMapper.insert(preMessage);
            return true;
        }

        return false;
    }

    //返回软件需求总数
    public int getCountSoftwareRequirements() throws Exception {
        //自定义查询对象
        SoftwareRequirementsExample SoftwareRequirementsExample = new SoftwareRequirementsExample();
        //通过criteria构造查询条件
        SoftwareRequirementsExample.Criteria criteria = SoftwareRequirementsExample.createCriteria();
        criteria.andApplicantIdIsNull();

        return softwareRequirementsMapper.countByExample(SoftwareRequirementsExample);
    }

    //返回部门物资申购总数
    public int getCountSoftwareRequirementsOfDepart(String dept) throws Exception {
        //自定义查询对象
        SoftwareRequirementsExample SoftwareRequirementsExample = new SoftwareRequirementsExample();
        //通过criteria构造查询条件
        SoftwareRequirementsExample.Criteria criteria = SoftwareRequirementsExample.createCriteria();
        criteria.andApplicantIdIsNull().andDeptCodeEqualTo(dept);

        return softwareRequirementsMapper.countByExample(SoftwareRequirementsExample);
    }

    //返回主管院长相关软件需求总数
    public int getCountSoftwareRequirementsOfdpdean(String dept, String code) throws Exception {
        //自定义查询对象
        SoftwareRequirementsExample SoftwareRequirementsExample = new SoftwareRequirementsExample();
        //通过criteria构造查询条件
        SoftwareRequirementsExample.Criteria criteria1 = SoftwareRequirementsExample.createCriteria();
        criteria1.andApplicantIdIsNull().andHighApprovedEqualTo(1).andHighLeaderApproved1EqualTo(1)
            .andHighLeaderId1EqualTo(code);

        SoftwareRequirementsExample.Criteria criteria2 = SoftwareRequirementsExample.createCriteria();
        criteria2.andApplicantIdIsNull().andDeptCodeEqualTo(dept);

        SoftwareRequirementsExample.or(criteria2);
        return softwareRequirementsMapper.countByExample(SoftwareRequirementsExample);
    }

    public SoftwareRequirementsCustom findById(Integer id) throws Exception {

        SoftwareRequirements SoftwareRequirements  = softwareRequirementsMapper.selectByPrimaryKey(id);
        SoftwareRequirementsCustom SoftwareRequirementsCustom = null;
        if (SoftwareRequirements != null) {
            SoftwareRequirementsCustom = new SoftwareRequirementsCustom();
            //类拷贝
            org.springframework.beans.BeanUtils.copyProperties(SoftwareRequirements, SoftwareRequirementsCustom);
        }

        return SoftwareRequirementsCustom;
    }


}
