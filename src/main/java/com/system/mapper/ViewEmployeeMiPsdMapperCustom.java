package com.system.mapper;

import com.system.po.ViewEmployeeMiPsdCustom;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ViewEmployeeMiPsdMapperCustom
 * 类描述：ViewEmployeeMiPsd拓展类Mapper（登录表Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-5 16:20:20
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface ViewEmployeeMiPsdMapperCustom {

    ViewEmployeeMiPsdCustom findOneByName(String name) throws Exception;

}
