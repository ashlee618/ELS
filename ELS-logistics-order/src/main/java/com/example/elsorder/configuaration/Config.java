package com.example.elsorder.configuaration;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.example.elsorder.Utils.SnowflakeIdUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.elsorder.mapper")
public class Config {
    /***
     * 雪花算法生成器
     */
    @Bean
    public SnowflakeIdUtils snowflakeIdUtils (){
        return new SnowflakeIdUtils(5,5);
    }
}
