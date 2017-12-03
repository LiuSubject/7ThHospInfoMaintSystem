package com.system.mapper;

import com.system.po.MaterialApplication;
import com.system.po.MaterialApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationMapper
 * 类描述：MaterialApplicationMapper（物资申购表Mapper）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public interface MaterialApplicationMapper {
    int countByExample(MaterialApplicationExample example);

    int deleteByExample(MaterialApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialApplication record);

    int insertSelective(MaterialApplication record);

    List<MaterialApplication> selectByExample(MaterialApplicationExample example);

    MaterialApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialApplication record, @Param("example") MaterialApplicationExample example);

    int updateByExample(@Param("record") MaterialApplication record, @Param("example") MaterialApplicationExample example);

    int updateByPrimaryKeySelective(MaterialApplication record);

    int updateByPrimaryKey(MaterialApplication record);
}