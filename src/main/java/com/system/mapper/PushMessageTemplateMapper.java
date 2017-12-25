package com.system.mapper;

import com.system.po.PushMessageTemplate;
import com.system.po.PushMessageTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMessageTemplateMapper {
    int countByExample(PushMessageTemplateExample example);

    int deleteByExample(PushMessageTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PushMessageTemplate record);

    int insertSelective(PushMessageTemplate record);

    List<PushMessageTemplate> selectByExample(PushMessageTemplateExample example);

    PushMessageTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PushMessageTemplate record, @Param("example") PushMessageTemplateExample example);

    int updateByExample(@Param("record") PushMessageTemplate record, @Param("example") PushMessageTemplateExample example);

    int updateByPrimaryKeySelective(PushMessageTemplate record);

    int updateByPrimaryKey(PushMessageTemplate record);
}