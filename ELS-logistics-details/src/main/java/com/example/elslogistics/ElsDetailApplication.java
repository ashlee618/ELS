package com.example.elslogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElsDetailApplication {



    public static void main(String[] args) {
        SpringApplication.run(ElsDetailApplication.class, args);
    }




}
