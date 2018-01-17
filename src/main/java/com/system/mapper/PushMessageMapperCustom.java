package com.system.mapper;

import com.system.po.PushMessage;

import java.util.List;
import java.util.Map;

public interface PushMessageMapperCustom {

    List<PushMessage> findSpecifiedByStatus(Map<String, Object> map);
}