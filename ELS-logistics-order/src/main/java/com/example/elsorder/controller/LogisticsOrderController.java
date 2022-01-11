package com.example.elsorder.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.example.elslogisticscommon.entry.ResultVO;
import com.example.elsorder.entity.LogisticsOrder;
import com.example.elsorder.entity.LogisticsOrderPackage;
import com.example.elsorder.service.impl.LogisticsOrderServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-04
 */
@RestController
@RequestMapping("/logistics-order")
public class LogisticsOrderController {
    @Autowired
    public TransactionTemplate transactionTemplate;


    @Autowired
    public LogisticsOrderServiceImpl service;

    public static final Logger logger = LoggerFactory.getLogger(LogisticsOrderController.class);
    /***
     * 创建订单
     * @param order
     * @return
     */
    @PostMapping("/v1/order")
    public ResultVO creatOrder(@RequestBody LogisticsOrder order) {
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean save = false;
        logger.info("开始创建订单");
        try{
            save = service.save(order);
            logger.info("创建订单完成,id:{}",order.getId());
        }catch (Exception e){
            logger.error("创建订单失败,id:{}",order.getId(),e);
        }
        result.setMsg(save == true ? "true" : "false");
        return result;
    }

    /***
     * 查询订单
     * @param id
     * @return
     */
    @GetMapping("/v1/ order")
    public ResultVO getOrder(@RequestParam("id") String id){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setData(service.getById(id));
        return resultVO;
    }

    /***
     * 删除订单
     * @param id
     * @return
     */
    @DeleteMapping("/order")
    public ResultVO deleteOrder(@RequestParam("id") String id){
        ResultVO result = new ResultVO();
        result.setCode(200);
        result.setData(service.removeById(id));
        boolean delete = false;
        logger.info("开始删除订单");
        try{
            delete = service.removeById(id);
            logger.info("删除订单完成,id:{}",id);
        }catch (Exception e){
            logger.error("删除订单失败,id:{}",id,e);
        }
        result.setMsg(delete == true ? "true" : "false");
        return result;
    }

    /***
     * 更新订单
     * @param order
     * @return
     */
    @PutMapping("/order")
    public ResultVO updateOrder(@RequestBody LogisticsOrder order){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean update = false;
        logger.info("开始更新订单");
        try{
            update = service.updateById(order);
            logger.info("更新订单完成,id:{}",order.getId());
        }catch (Exception e){
            logger.error("更新订单失败,id:{}",order.getId(),e);
        }
        result.setMsg(update == true ? "true" : "false");
        return result;
    }
}

