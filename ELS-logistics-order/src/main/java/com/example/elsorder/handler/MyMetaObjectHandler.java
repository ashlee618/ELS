package com.example.elsorder.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component // 一定不要忘记把处理器加到IOC容器中！
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 插入时的填充策略

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("开始自动填充-插入");
        this.setFieldValByName("gmtCreated",new Date(),metaObject);
        this.setFieldValByName("gmtModified",new Date(),metaObject);
        this.setFieldValByName("isDelete",0,metaObject);
        this.setFieldValByName("status",0,metaObject);
        this.setFieldValByName("version",0,metaObject);

    }

    // 更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("开始自动填充-更新");
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }
}