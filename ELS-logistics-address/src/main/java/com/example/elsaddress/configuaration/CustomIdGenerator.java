package com.example.elsaddress.configuaration;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.example.elslogisticscommon.utils.SnowflakeIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Mybatis-plus 自定义主键生成器
 */
@Component
public class CustomIdGenerator implements IdentifierGenerator {
    @Autowired
    public SnowflakeIdUtils snowflakeIdUtils;

    @Override
    public Long nextId(Object entity) {
        return snowflakeIdUtils.nextId();
    }
}
