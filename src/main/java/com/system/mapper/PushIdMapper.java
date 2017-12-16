package com.system.mapper;

import com.system.po.PushId;
import com.system.po.PushIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushIdMapper {
    int countByExample(PushIdExample example);

    int deleteByExample(PushIdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PushId record);

    int insertSelective(PushId record);

    List<PushId> selectByExample(PushIdExample example);

    PushId selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PushId record, @Param("example") PushIdExample example);

    int updateByExample(@Param("record") PushId record, @Param("example") PushIdExample example);

    int updateByPrimaryKeySelective(PushId record);

    int updateByPrimaryKey(PushId record);
}