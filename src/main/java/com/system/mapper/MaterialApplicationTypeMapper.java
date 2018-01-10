package com.system.mapper;

import com.system.po.MaterialApplicationType;
import com.system.po.MaterialApplicationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialApplicationTypeMapper {
    int countByExample(MaterialApplicationTypeExample example);

    int deleteByExample(MaterialApplicationTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialApplicationType record);

    int insertSelective(MaterialApplicationType record);

    List<MaterialApplicationType> selectByExample(MaterialApplicationTypeExample example);

    MaterialApplicationType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialApplicationType record, @Param("example") MaterialApplicationTypeExample example);

    int updateByExample(@Param("record") MaterialApplicationType record, @Param("example") MaterialApplicationTypeExample example);

    int updateByPrimaryKeySelective(MaterialApplicationType record);

    int updateByPrimaryKey(MaterialApplicationType record);
}