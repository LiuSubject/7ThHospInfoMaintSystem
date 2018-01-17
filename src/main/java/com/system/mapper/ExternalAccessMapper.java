package com.system.mapper;

import com.system.po.ExternalAccess;
import com.system.po.ExternalAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalAccessMapper {
    int countByExample(ExternalAccessExample example);

    int deleteByExample(ExternalAccessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExternalAccess record);

    int insertSelective(ExternalAccess record);

    List<ExternalAccess> selectByExample(ExternalAccessExample example);

    ExternalAccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExternalAccess record, @Param("example") ExternalAccessExample example);

    int updateByExample(@Param("record") ExternalAccess record, @Param("example") ExternalAccessExample example);

    int updateByPrimaryKeySelective(ExternalAccess record);

    int updateByPrimaryKey(ExternalAccess record);
}