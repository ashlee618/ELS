package com.example.elsorder.configuaration;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.example.elsorder.Utils.SnowflakeIdUtils;
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
      	//可以将当前传入的class全类名来作为bizKey,或者提取参数来生成bizKey进行分布式Id调用生成.
//      	String bizKey = entity.getClass().getName();
        //根据bizKey调用分布式ID生成
//        long id = snowflakeIdUtils.nextId();
      	//返回生成的id值即可.
        return snowflakeIdUtils.nextId();
    }
}
