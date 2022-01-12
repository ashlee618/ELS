package com.example.elsorder;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.example.elslogisticscommon.utils.SnowflakeIdUtils;
import com.example.elsorder.entity.LogisticsOrderPackage;
import com.example.elsorder.mapper.LogisticsOrderPackageMapper;
import com.example.elsorder.service.impl.LogisticsOrderPackageServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ElsOrderApplicationTests {

    @Autowired
    public LogisticsOrderPackageServiceImpl service;

    @Autowired
    public LogisticsOrderPackageMapper mapper;

    @Test
    void TestInsertData() {
        LogisticsOrderPackage logisticsOrderPackage = new LogisticsOrderPackage();
        logisticsOrderPackage.setBuyerId(123L);
        logisticsOrderPackage.setLgOrderCode("123");
        logisticsOrderPackage.setPackageType(1);
//        logisticsOrderPackage.setIsDelete(0);
//        logisticsOrderPackage.setStatus(1);
//        logisticsOrderPackage.setVersion(1);
        service.saveOrUpdate(logisticsOrderPackage);
    }

    @Test
    void TestRemove(){
        service.removeById(1211);
    }
    @Test
    void TestVersion(){
        //TODO 乐观锁测试没调好
        LogisticsOrderPackage logisticsOrderPackage = new LogisticsOrderPackage();
        logisticsOrderPackage.setId(1477865580481011714L);
        logisticsOrderPackage.setBuyerId(222L);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("buyer_id",122242L);



        System.out.println(mapper.update(logisticsOrderPackage,queryWrapper));
//        service.updateById(logisticsOrderPackage);
    }
    @Test
    void TestSnow(){

        SnowflakeIdUtils snowflakeIdUtils = new SnowflakeIdUtils(1, 1);
        System.out.println(snowflakeIdUtils.nextId());
        System.out.println(snowflakeIdUtils.nextId());
    }
//927986 328577384448
//927986 328577384449
//927986 892308619264
//927986 892308619265




}
