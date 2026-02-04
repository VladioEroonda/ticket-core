package ru.eroonda.ticketservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
// TODO: Прикрутить версионированиие https://spring.io/blog/2025/09/16/api-versioning-in-spring
public class ApiVersionConfig implements WebMvcConfigurer {
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
//        configurer.usePathSegment();
//        configurer.useRequestHeader("API-Version");
    }
}
