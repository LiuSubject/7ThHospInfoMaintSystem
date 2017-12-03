package com.system.service;

import com.system.po.EngineRoomInspectionCustom;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：EngineRoomInspectionService
 * 类描述：EngineRoomInspection机房巡检表Service层
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface EngineRoomInspectionService {
    //根据id更新机房巡检信息
    void updataById(Integer id, EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception;

    //根据id删除机房巡检信息
    void removeById(Integer id) throws Exception;

    //获取分页查询机房巡检信息
    List<EngineRoomInspectionCustom> findByPaging(Integer toPageNo) throws Exception;

    //保存机房巡检信息
    Boolean save(EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception;

    //获取机房巡检总数
    int getCountEngineRoomInspection() throws Exception;

    //根据id获取机房巡检信息
    EngineRoomInspectionCustom findById(Integer id) throws Exception;

    //根据巡检人模糊查询
    List<EngineRoomInspectionCustom> findByExaminer(String examiner) throws Exception;
}
