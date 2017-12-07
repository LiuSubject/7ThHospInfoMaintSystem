package com.system.mapper;

import com.system.po.ViewEmployeeMiPsd;
import com.system.po.ViewEmployeeMiPsdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewEmployeeMiPsdMapper {
    int countByExample(ViewEmployeeMiPsdExample example);

    int deleteByExample(ViewEmployeeMiPsdExample example);

    int insert(ViewEmployeeMiPsd record);

    int insertSelective(ViewEmployeeMiPsd record);

    List<ViewEmployeeMiPsd> selectByExample(ViewEmployeeMiPsdExample example);

    int updateByExampleSelective(@Param("record") ViewEmployeeMiPsd record, @Param("example") ViewEmployeeMiPsdExample example);

    int updateByExample(@Param("record") ViewEmployeeMiPsd record, @Param("example") ViewEmployeeMiPsdExample example);
}