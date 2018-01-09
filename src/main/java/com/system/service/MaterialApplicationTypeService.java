package com.system.service;

import com.system.po.ComputerProblemsType;
import com.system.po.MaterialApplicationCustom;
import com.system.po.MaterialApplicationType;
import com.system.po.PushMessage;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationTypeService
 * 类描述：MaterialApplicationType物资申购类型表Service接口层
 * 创建人：lxk
 * 创建时间：2018-1-9 10:03:21
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface MaterialApplicationTypeService {

    List<MaterialApplicationType> getAll();
}
