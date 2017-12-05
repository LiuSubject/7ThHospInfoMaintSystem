package com.system.util;

import org.apache.commons.lang.StringUtils;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：CustomerContextHolder
 * 类描述：动态数据源切换实现
 * 创建人：lxk
 * 创建时间：2017-12-05 14:36
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class CustomerContextHolder {
    //MySQL
    public static final String DATA_SOURCE_MYSQL = "dataSource";
    //SQLServer
    public static final String DATA_SOURCE_MSSQL = "dataSource2";
    //用ThreadLocal来设置当前线程使用哪个dataSource
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
    public static String getCustomerType() {
        String dataSource = contextHolder.get();
        if (StringUtils.isEmpty(dataSource)) {
            return DATA_SOURCE_MYSQL;
        }else {
            return dataSource;
        }
    }
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}