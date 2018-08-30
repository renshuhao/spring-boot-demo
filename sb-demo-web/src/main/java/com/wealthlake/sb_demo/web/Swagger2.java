package com.wealthlake.sb_demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 配置
 * Created By Rsh
 *
 * @author rsh
 * @Description
 * @Date: 2018/8/27
 * @Time: 17:43
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Value("${swagger.show}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wealthlake.sb_demo.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Luis Site Swagger Restful API")
                .description("更多Spring Boot相关文章请关注：https://luischen.com/")
                .termsOfServiceUrl("https://luischen.com/")
                .contact(new Contact("rsh", "", ""))
                .version("1.0")
                .build();
    }

}
