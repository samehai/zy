package com.zy.oms.config;

import com.zy.oms.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(value = "com.zy.oms")
@Configuration
public class MyConfig {
    @Bean("zhangzhe")
    public User CreateUser() {
        return new User(1000L, "zhangzhe", 39);
    }

    /**
     * 测试restTemplate
     * @return
     */
    /*@Bean
    public RestTemplate restTemplate() {
        //必须new 一个RestTemplate并放入spring容器当中,否则启动时报错
        RestTemplate restTemplate = new RestTemplate();
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectionRequestTimeout(30 * 1000);
        httpRequestFactory.setConnectTimeout(30 * 3000);
        httpRequestFactory.setReadTimeout(30 * 3000);
        restTemplate.setRequestFactory(httpRequestFactory);
        return restTemplate;
    }*/
}
