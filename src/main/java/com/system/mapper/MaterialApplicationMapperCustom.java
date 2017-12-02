package com.system.mapper;

import com.system.po.MaterialApplicationCustom;
import com.system.po.PagingVO;

import java.util.List;

public interface MaterialApplicationMapperCustom {
    //分页查询物资申购
    List<MaterialApplicationCustom> findByPaging(PagingVO pagingVO) throws Exception;
}