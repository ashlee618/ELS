package com.example.elsaddress.configuaration;


import com.example.elslogisticscommon.utils.SnowflakeIdUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    /***
     * 雪花算法生成器
     */
    @Bean
    public SnowflakeIdUtils snowflakeIdUtils (){
        return new SnowflakeIdUtils(5,5);

    }
}
