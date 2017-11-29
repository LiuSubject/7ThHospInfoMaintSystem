package com.system.mapper;

import com.system.po.VManageLeader;

public interface VManageLeaderMapper {
    int insert(VManageLeader record);

    int insertSelective(VManageLeader record);
}