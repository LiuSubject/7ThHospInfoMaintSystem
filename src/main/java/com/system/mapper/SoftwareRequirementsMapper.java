package com.system.mapper;

import com.system.po.SoftwareRequirements;
import com.system.po.SoftwareRequirementsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareRequirementsMapper {
    int countByExample(SoftwareRequirementsExample example);

    int deleteByExample(SoftwareRequirementsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SoftwareRequirements record);

    int insertSelective(SoftwareRequirements record);

    List<SoftwareRequirements> selectByExample(SoftwareRequirementsExample example);

    SoftwareRequirements selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SoftwareRequirements record, @Param("example") SoftwareRequirementsExample example);

    int updateByExample(@Param("record") SoftwareRequirements record, @Param("example") SoftwareRequirementsExample example);

    int updateByPrimaryKeySelective(SoftwareRequirements record);

    int updateByPrimaryKey(SoftwareRequirements record);
}