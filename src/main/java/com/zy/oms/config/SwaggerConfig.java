package com.zy.oms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author ZhangZhe
 */

@Configuration
@ConditionalOnExpression("${swagger.enable}")
public class SwaggerConfig {

    @Value("${swagger.enable}") private boolean enable;

    @Bean
    public Docket createAccepterRestApi() {
        return new Docket(DocumentationType.OAS_30)
                //分组名,不指定默认为default
                .groupName("OMS API")
                .select()
                //.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                // 扫描的包路径
                .apis(RequestHandlerSelectors.basePackage("com.zy"))
                // 定义要生成文档的Api的url路径规则
                .paths(PathSelectors.any())
                .build()
                // 设置swagger-ui.html页面上的一些元素信息
                .apiInfo(apiInfo())
                .enable(enable);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("业务数据接收器RESTful API")
                // 创建人信息
                .description("美团、饿了么的业务处理文档")
                .contact(new Contact("samehai",  "https://www.lnkyt.com",  "samehai@163.com"))
                .termsOfServiceUrl("http://127.0.0.1:8082/")
                .version("1.0")
                .build();
    }
}
