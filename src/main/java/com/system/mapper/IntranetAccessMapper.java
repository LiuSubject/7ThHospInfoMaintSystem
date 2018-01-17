package com.system.mapper;

import com.system.po.IntranetAccess;
import com.system.po.IntranetAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntranetAccessMapper {
    int countByExample(IntranetAccessExample example);

    int deleteByExample(IntranetAccessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IntranetAccess record);

    int insertSelective(IntranetAccess record);

    List<IntranetAccess> selectByExample(IntranetAccessExample example);

    IntranetAccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IntranetAccess record, @Param("example") IntranetAccessExample example);

    int updateByExample(@Param("record") IntranetAccess record, @Param("example") IntranetAccessExample example);

    int updateByPrimaryKeySelective(IntranetAccess record);

    int updateByPrimaryKey(IntranetAccess record);
}