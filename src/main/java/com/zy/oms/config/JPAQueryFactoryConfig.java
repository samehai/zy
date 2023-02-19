package com.zy.oms.config;//package com.zhangzhe.oms.config;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import com.querydsl.sql.SQLQueryFactory;
//import com.querydsl.sql.SQLTemplates;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.PersistenceContext;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.util.function.Supplier;
//
///**
// * @author Administrator
// */
//@Configuration
//public class JPAQueryFactoryConfig {
//
//    /**
//     * @Transactional事务使用总结：
//     *
//     * 1、异常在A方法内抛出，则A方法就得加注解
//     * 2、多个方法嵌套调用，如果都有 @Transactional 注解，则产生事务传递，默认 Propagation.REQUIRED
//     * 3、如果注解上只写 @Transactional  默认只对 RuntimeException 回滚，而非 Exception 进行回滚
//     * 如果要对 checked Exceptions 进行回滚，则需要 @Transactional(rollbackFor = Exception.class)
//     *
//     * org.springframework.orm.jpa.JpaTransactionManager
//     *
//     * org.springframework.jdbc.datasource.DataSourceTransactionManager
//     *
//     * org.springframework.transaction.jta.JtaTransactionManager
//     *
//     */
//    @PersistenceContext
//    private EntityManager entityManager;
//
////    @PersistenceContext
////    private EntityManagerFactory entityManagerFactory;
//
////    @Bean
////    public JPAQueryFactory jpaQueryFactory() {
////
////        return new JPAQueryFactory(entityManager);
////    }
//
//
////    @Bean
////    public SQLQueryFactory sqlQueryFactory(){
////        DataSource dataSource = null;
////        return new SQLQueryFactory(new com.querydsl.sql.Configuration(SQLTemplates.DEFAULT), dataSource);
////    }
//
//
////    EntityManagerFactory emf =
////            Persistence.createEntityManagerFactory("com.baeldung.querydsl.intro");
////    EntityManager em = emf.createEntityManager();
////    JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//}