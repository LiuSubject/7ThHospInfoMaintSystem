package com.system.mapper;

import com.system.po.MaterialApplication;
import com.system.po.MaterialApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialApplicationMapper {
    int countByExample(MaterialApplicationExample example);

    int deleteByExample(MaterialApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialApplication record);

    int insertSelective(MaterialApplication record);

    List<MaterialApplication> selectByExample(MaterialApplicationExample example);

    MaterialApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialApplication record, @Param("example") MaterialApplicationExample example);

    int updateByExample(@Param("record") MaterialApplication record, @Param("example") MaterialApplicationExample example);

    int updateByPrimaryKeySelective(MaterialApplication record);

    int updateByPrimaryKey(MaterialApplication record);
}