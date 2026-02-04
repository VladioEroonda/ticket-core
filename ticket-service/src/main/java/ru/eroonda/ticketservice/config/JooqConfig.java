package ru.eroonda.ticketservice.config;

import org.jooq.conf.RenderNameCase;
import org.springframework.boot.jooq.autoconfigure.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfig {
    // Фиксит баг, из-за которого (при использовании Jooq и Liquibase), названия таблиц в запросах указаны в верхнем регистре
    // Т.е. то, на что 15й постгрес ругается
    @Bean
    public DefaultConfigurationCustomizer jooqDefaultConfigurationCustomizer() {
        return c -> c.settings().withRenderNameCase(RenderNameCase.LOWER);
    }
}
