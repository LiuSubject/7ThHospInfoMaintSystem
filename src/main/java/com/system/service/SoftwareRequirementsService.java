package com.system.service;

import com.system.po.PushMessage;
import com.system.po.SoftwareRequirementsCustom;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：SoftwareRequirementsService
 * 类描述：SoftwareRequirements软件需求表Service接口层
 * 创建人：lxk
 * 创建时间：2018-02-07 16:18
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface SoftwareRequirementsService {
    //根据id更新软件需求信息
    void updataById(Integer id, SoftwareRequirementsCustom softwareRequirementsCustom) throws Exception;

    //根据id删除软件需求信息
    void removeById(Integer id) throws Exception;

    //获取分页查询软件需求信息
    List<SoftwareRequirementsCustom> findByPaging(Integer toPageNo) throws Exception;

    //获取分页查询主管院长软件需求信息
    List<SoftwareRequirementsCustom> findByDpdeanPaging(Map<String, Object> map) throws Exception;

    //获取分页查询部门软件需求信息
    List<SoftwareRequirementsCustom> findByPagingOfDepart(Map<String, Object> map) throws Exception;

    //保存软件需求信息
    Boolean save(SoftwareRequirementsCustom softwareRequirementsCustom) throws Exception;

    //事务：保存软件需求信息，并初始化推送消息
    Boolean saveAndPre(SoftwareRequirementsCustom softwareRequirementsCustom, PushMessage preMessage) throws Exception;

    //获取软件需求总数
    int getCountSoftwareRequirements() throws Exception;

    //主管院长获取软件需求总数
    int getCountSoftwareRequirementsOfdpdean(String dept, String code) throws Exception;

    //获取部门软件需求总数
    int getCountSoftwareRequirementsOfDepart(String dept) throws Exception;

    //根据id获取软件需求信息
    SoftwareRequirementsCustom findById(Integer id) throws Exception;
}
