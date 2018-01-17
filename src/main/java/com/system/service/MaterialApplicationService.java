package com.system.service;

import com.system.po.MaterialApplicationCustom;
import com.system.po.PushMessage;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationService
 * 类描述：MaterialApplication物资申购表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface MaterialApplicationService {
    //根据id更新物资申购信息
    void updataById(Integer id, MaterialApplicationCustom materialApplicationCustom) throws Exception;

    //根据id删除物资申购信息
    void removeById(Integer id) throws Exception;

    //获取分页查询物资申购信息
    List<MaterialApplicationCustom> findByPaging(Integer toPageNo) throws Exception;

    //获取分页查询部门物资申购信息
    List<MaterialApplicationCustom> deptFindByPaging(Integer toPageNo,String deptName) throws Exception;

    //电脑故障信息搜索结果(分页有缺陷，未分页)
    List<MaterialApplicationCustom> paginationOfSearchResults(Map<String, Object> condition) throws Exception;

    //保存物资申购信息
    Boolean save(MaterialApplicationCustom materialApplicationCustom) throws Exception;

    //事务：保存物资申购信息，并初始化推送消息
    Boolean saveAndPre(MaterialApplicationCustom materialApplicationCustom, PushMessage preMessage) throws Exception;

    //获取物资申购总数
    int getCountMaterialApplication() throws Exception;

    //获取物资申购总数
    int getCountDeptMaterialApplication(String currentDept) throws Exception;

    //根据id获取物资申购信息
    MaterialApplicationCustom findById(Integer id) throws Exception;

    //根据部门模糊查询
    List<MaterialApplicationCustom> findByDept(String dept) throws Exception;

    //根据名字模糊查询
    List<MaterialApplicationCustom> findByName(String name) throws Exception;

    //根据状态模糊查询
    List<MaterialApplicationCustom> findByFlag(Integer flag) throws Exception;

    //根据申请人工号查询
    List<MaterialApplicationCustom> findByUserID(String code) throws Exception;
}
