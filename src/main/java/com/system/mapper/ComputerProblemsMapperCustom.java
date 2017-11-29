package com.system.mapper;

import com.system.po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComputerProblemsMapperCustom {
    //分页查询电脑故障
    List<ComputerProblemsCustom> findByPaging(PagingVO pagingVO) throws Exception;
}