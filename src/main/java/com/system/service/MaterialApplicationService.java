package com.system.service;

import com.system.po.MaterialApplicationCustom;

import java.util.List;

/**
 * MaterialApplication物资申购Service层
 */
public interface MaterialApplicationService {
    //根据id更新物资申购信息
    void updataById(Integer id, MaterialApplicationCustom materialApplicationCustom) throws Exception;

    //根据id删除物资申购信息
    void removeById(Integer id) throws Exception;

    //获取分页查询物资申购信息
    List<MaterialApplicationCustom> findByPaging(Integer toPageNo) throws Exception;

    //保存物资申购信息
    Boolean save(MaterialApplicationCustom materialApplicationCustom) throws Exception;

    //获取物资申购总数
    int getCountMaterialApplication() throws Exception;

    //根据id获取物资申购信息
    MaterialApplicationCustom findById(Integer id) throws Exception;

    //根据部门模糊查询
    List<MaterialApplicationCustom> findByDept(String dept) throws Exception;

    //根据名字模糊查询
    List<MaterialApplicationCustom> findByName(String name) throws Exception;

    //根据状态模糊查询
    List<MaterialApplicationCustom> findByFlag(Integer flag) throws Exception;
}
