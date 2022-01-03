package com.example.elsorder;

//import org.mybatis.spring.annotation.MapperScan;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.elsorder.mapper")
public class ElsOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElsOrderApplication.class, args);
    }


    @RestController
    public class Testcontroller {
        @RequestMapping(value = "/echo", method = RequestMethod.GET)
        public String echo() {
            return "Hello Nacos Discovery ";
        }
    }
}
