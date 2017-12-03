package com.system.mapper;

import com.system.po.UserloginCustom;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：UserloginMapperCustom
 * 类描述：Userlogin拓展类Mapper（登录表Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface UserloginMapperCustom {

    UserloginCustom findOneByName(String name) throws Exception;

}
