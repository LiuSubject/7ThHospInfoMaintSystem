package com.system.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：DynamicDataSource
 * 类描述：动态数据源切换
 * 创建人：lxk
 * 创建时间：2017-12-05 14:34
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return CustomerContextHolder.getCustomerType();
    }
}
