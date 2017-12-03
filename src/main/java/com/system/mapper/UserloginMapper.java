package com.system.mapper;

import com.system.po.Userlogin;
import com.system.po.UserloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：UserloginMapper
 * 类描述：UserloginMapper（登录表Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface UserloginMapper {
    int countByExample(UserloginExample example);

    int deleteByExample(UserloginExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    List<Userlogin> selectByExample(UserloginExample example);

    Userlogin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByExample(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
}