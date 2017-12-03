package com.system.mapper;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsMapper
 * 类描述：ComputerProblemsMapper
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

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