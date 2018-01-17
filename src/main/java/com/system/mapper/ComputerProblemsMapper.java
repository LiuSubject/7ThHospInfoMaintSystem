package com.system.mapper;

import com.system.po.ComputerProblems;
import com.system.po.ComputerProblemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComputerProblemsMapper {
    int countByExample(ComputerProblemsExample example);

    int deleteByExample(ComputerProblemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComputerProblems record);

    int insertSelective(ComputerProblems record);

    List<ComputerProblems> selectByExample(ComputerProblemsExample example);

    ComputerProblems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComputerProblems record, @Param("example") ComputerProblemsExample example);

    int updateByExample(@Param("record") ComputerProblems record, @Param("example") ComputerProblemsExample example);

    int updateByPrimaryKeySelective(ComputerProblems record);

    int updateByPrimaryKey(ComputerProblems record);
}