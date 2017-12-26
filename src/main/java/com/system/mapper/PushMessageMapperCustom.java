package com.system.mapper;

import com.system.po.PushMessage;
import com.system.po.PushMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PushMessageMapperCustom {

    List<PushMessage> findSpecifiedByStatus(Map<String, Object> map);
}