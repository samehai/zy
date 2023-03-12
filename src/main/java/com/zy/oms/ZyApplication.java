package com.zy.oms;

import org.slf4j.Logger;import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})//使自带的数据源配置失效
//@EnableAspectJAutoProxy(exposeProxy=true) // 启动AOP
// 可选，指定扫描的表映射实体Entity的目录，如果不指定，会扫描全部目录
//@EntityScan("com.zy.oms.entity")
// 可选，指定扫描的表repository目录，如果不指定，会扫描全部目录
//@EnableJpaRepositories(basePackages = {"com.zy.oms.repository"})
@SpringBootApplication
public class ZyApplication {
//	private static final Logger log = org.slf4j.LoggerFactory.getLogger(ZyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZyApplication.class, args);
//		log.error("Something else is wrong here");
//		log.info("Something else is wrong here");
//		log.warn("Something else is wrong here");
	}

}