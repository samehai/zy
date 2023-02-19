package com.zy.oms.config;//package com.zhangzhe.oms.config;
//
//
//import com.ejlchina.searcher.BeanMeta;
//import com.ejlchina.searcher.ParamFilter;
//import com.ejlchina.searcher.dialect.Dialect;
//import com.ejlchina.searcher.dialect.PostgreSqlDialect;
//import com.ejlchina.searcher.dialect.SqlServerDialect;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Map;
//
//@ComponentScan(value = "com.zhangzhe.oms")
//@Configuration
//public class BeanSearcherConfig {
//
//    /**
//     * 定义BeanSearcher方言为SQLSERVER
//     * MySqlDialect - 默认方言，可用于 类 MySql 的数据库
//     * OracleDialect - 可用于 类 Oracle 的数据库
//     * PostgreSqlDialect - 可用于 类 PostgreSqlDialect 的数据库（since v3.6.0）
//     * SqlServerDialect - 可用于 类 SqlServer (v2012+) 的数据库（since v3.7.0）
//     * @return
//     */
//    @Bean
//    public Dialect sqlServerDialect() {
//        return new SqlServerDialect();
//    }
////    @Bean
////    public Dialect postgreSqlDialect() {
////        return new PostgreSqlDialect();
////    }
//
//
////    Bean Searcher 还支持配置全局参数过滤器，可自定义任何参数过滤规则。
////
////    案例：使用 参数过滤器器 简化 op=mv/bt 时的多值传参，例如：用 age=[20,30] 替代 age-0=20 & age-1=30 参数。
////    @Bean
////    public ParamFilter myParamFilter() {
////        return new ParamFilter() {
////            @Override
////            public <T> Map<String, Object> doFilter(BeanMeta<T> beanMeta, Map<String, Object> paraMap) {
////                // beanMeta 是正在检索的实体类的元信息, paraMap 是当前的检索参数
////                // TODO: 这里可以写一些自定义的参数过滤规则
////                return paraMap;      // 返回过滤后的检索参数
////            }
////        };
////    }
//}
