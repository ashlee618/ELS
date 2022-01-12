package com.example.elsaddress;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.elsaddress.mapper")
public class ElsAddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElsAddressApplication.class, args);
    }
}
