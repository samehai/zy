//package com.zy.oms.config;
//
//import com.zy.oms.datasource.DynamicDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.ds1")
//    @Primary
//    public DataSource dataSource1() {
//        // 底层会自动拿到spring.datasource中的配置， 创建一个DruidDataSource
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.ds2")
//    public DataSource dataSource2() {
//
//        // 底层会自动拿到spring.datasource中的配置， 创建一个DruidDataSource
//        return DataSourceBuilder.create().build();
//    }
//
//
//    @Bean
//    public PlatformTransactionManager transactionManager(DynamicDataSource dataSource) {
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(dataSource);
//        return dataSourceTransactionManager;
//    }
//}
