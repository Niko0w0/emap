package com.qdu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决异步访问跨域
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //本应用的所有方法都会去处理跨域请求
        registry.addMapping("http://localhost:8080")
                //允许远端访问的域名
                .allowedOrigins("*")
                //允许请求的方法
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE", "PATCH")
                //允许请求头
                .allowedHeaders("*")
//                .allowedHeaders("access-control-allow-headers",
//                        "access-control-allow-methods",
//                        "access-control-allow-origin",
//                        "access-control-max-age",
//                        "X-Frame-Options","X-Token")
                .maxAge(3600);
    }

}