package com.zy.oms.datasource;

import java.util.ArrayList;
import java.util.List;

public class DataSourceContextHolder {

    // 存放当前线程使用的数据源类型
    public static ThreadLocal<String> keyName = new ThreadLocal<>();

    //存放数据源id
    public static List<String> dataSourceIds = new ArrayList<String>();

    // 设置数据源
    public static void setKey(String key) {
        DataSourceContextHolder.keyName.set(key);
    }

    // 获取数据源
    public static String getKey() {
        return keyName.get();
    }

    // 清除数据源
    public static void clearKey() {
        keyName.remove();
    }

    //判断当前数据源是否存在
    public static boolean isContainsDataSource(String dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }
}
