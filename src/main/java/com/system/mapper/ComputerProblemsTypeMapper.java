package com.system.mapper;

import com.system.po.ComputerProblemsType;
import com.system.po.ComputerProblemsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComputerProblemsTypeMapper {
    int countByExample(ComputerProblemsTypeExample example);

    int deleteByExample(ComputerProblemsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComputerProblemsType record);

    int insertSelective(ComputerProblemsType record);

    List<ComputerProblemsType> selectByExample(ComputerProblemsTypeExample example);

    ComputerProblemsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComputerProblemsType record, @Param("example") ComputerProblemsTypeExample example);

    int updateByExample(@Param("record") ComputerProblemsType record, @Param("example") ComputerProblemsTypeExample example);

    int updateByPrimaryKeySelective(ComputerProblemsType record);

    int updateByPrimaryKey(ComputerProblemsType record);
}