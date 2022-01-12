package com.example.elsaddress.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.elsaddress.entity.UserAddress;
import com.example.elsaddress.service.impl.UserAddressServiceImpl;
import com.example.elslogisticscommon.entry.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-12
 */
@RestController
@RequestMapping("/user-address/v1")
public class UserAddressController {

    public static final Logger logger = LoggerFactory.getLogger(UserAddressController.class);

    @Autowired
    public UserAddressServiceImpl service;



    /***
     * 查询用户地址
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResultVO getUserAddress(@PathVariable("userId") long userId){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_id",userId);
        resultVO.setData(service.list(wrapper));
        return resultVO;
    }

    /***
     * 创建用户地址
     * @param address
     * @return
     */
    @PostMapping()
    public ResultVO createUserAddress(@RequestBody UserAddress address){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean save = false;
        logger.info("开始创建用户地址");
        try{
            save = service.save(address);
            logger.info("创建用户地址完成,id:{}",address.getId());
        }catch (Exception e){
            logger.error("创建用户地址失败,id:{}",address.getId(),e);
        }
        result.setMsg(save == true ? "true" : "false");
        return result;
    }

    /***
     * 删除用户地址
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    public ResultVO deleteUserAddress(@PathVariable("userId") long userId){
        ResultVO result = new ResultVO();
        result.setCode(200);
        result.setData(service.removeById(userId));
        boolean delete = false;
        logger.info("开始删除用户地址");
        try{
            delete = service.removeById(userId);
            logger.info("删除用户地址完成,id:{}",userId);
        }catch (Exception e){
            logger.error("删除用户地址失败,id:{}",userId,e);
        }
        result.setMsg(delete == true ? "true" : "false");
        return result;
    }

    /***
     * 更新用户地址
     * @param address
     * @return
     */
    @PutMapping()
    public ResultVO updateUserAddress(@RequestBody UserAddress address){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean update = false;
        logger.info("开始更新用户地址");
        try{
            update = service.updateById(address);
            logger.info("更新用户地址完成,id:{}",address.getId());
        }catch (Exception e){
            logger.error("更新用户地址失败,id:{}",address.getId(),e);
        }
        result.setMsg(update == true ? "true" : "false");
        return result;
    }
}

