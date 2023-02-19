//package com.zy.oms.datasource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//@Primary   // 将该Bean设置为主要注入Bean
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//    @Autowired
//    DataSource dataSource1;
//    @Autowired
//    DataSource dataSource2;
//    // 返回当前数据源标识
//    @Override
//    protected Object determineCurrentLookupKey() {
//        return DataSourceContextHolder.getKey();
//    }
//
//
//    @Override
//    public void afterPropertiesSet() {
//
//        // 为targetDataSources初始化所有数据源
//
//        Map<Object, Object> targetDataSources = new HashMap<>();
//        targetDataSources.put("ds1", dataSource1);
//        targetDataSources.put("ds2", dataSource2);
//
//        super.setTargetDataSources(targetDataSources);
//
//        // 为defaultTargetDataSource 设置默认的数据源
//        super.setDefaultTargetDataSource(dataSource1);
//
//        super.afterPropertiesSet();
//    }
//}
