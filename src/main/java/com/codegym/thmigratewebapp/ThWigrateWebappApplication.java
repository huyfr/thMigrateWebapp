package com.codegym.thmigratewebapp;

import com.codegym.thmigratewebapp.service.CustomerService;
import com.codegym.thmigratewebapp.service.ProvinceService;
import com.codegym.thmigratewebapp.service.impl.CustomerServiceImplWithSpringData;
import com.codegym.thmigratewebapp.service.impl.ProvinceServiceImplWithSpringData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThWigrateWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThWigrateWebappApplication.class, args);
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImplWithSpringData();
    }

    @Bean
    public ProvinceService provinceService() {
        return new ProvinceServiceImplWithSpringData();
    }

}