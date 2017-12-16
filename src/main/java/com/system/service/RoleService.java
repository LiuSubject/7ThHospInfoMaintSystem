package com.system.service;

import com.system.po.Role;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：RoleService
 * 类描述：Role 权限表Service接口层
 * 创建人：lxk
 * 创建时间：2017-12-3 14:52:22
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface RoleService {

    Role findByid(Integer id) throws Exception;

}
