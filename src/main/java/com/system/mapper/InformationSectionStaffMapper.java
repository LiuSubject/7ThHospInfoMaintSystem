package com.system.mapper;

import com.system.po.InformationSectionStaff;

public interface InformationSectionStaffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InformationSectionStaff record);

    int insertSelective(InformationSectionStaff record);

    InformationSectionStaff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InformationSectionStaff record);

    int updateByPrimaryKey(InformationSectionStaff record);
}