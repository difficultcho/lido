package com.nadi.lido;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.nadi.lido.mapper")
@SpringBootApplication
public class LidoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LidoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LidoApplication.class, args);
    }

}