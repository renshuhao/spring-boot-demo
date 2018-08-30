package com.wealthlake.sb_demo.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * web项目已war包形式部署到外部tomcat需要该ServletInitalizer
 * Created By Rsh
 *
 * @author rsh
 * @Description
 * @Date: 2018/8/28
 * @Time: 15:01
 */

public class ServletInitalizer extends SpringBootServletInitializer {

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(SbDemoWebApplication.class);
    }

}
