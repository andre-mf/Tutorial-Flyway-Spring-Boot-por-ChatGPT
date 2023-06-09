package com.example.flywayspringbootdemo.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class FlywayConfig {

    @Value("${spring.datasource.url}")    private String url;        @Value("${spring.datasource.username}")
    private String username;        @Value("${spring.datasource.password}")
    private String password;        @Bean(initMethod = "migrate")
    public Flyway flyway() {        return Flyway.configure()                .dataSource(url, username, password)                .locations("classpath:db/migration")                .load();    }
}