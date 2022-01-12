package com.example.elsorder.controller;


import com.example.elslogisticscommon.entry.ResultVO;
import com.example.elsorder.entity.LogisticsOrderItem;
import com.example.elsorder.service.impl.LogisticsOrderItemServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-04
 */
@RestController
@RequestMapping("/logistics-order-item/v1")
@Transactional()
public class LogisticsOrderItemController {

    @Autowired
    public LogisticsOrderItemServiceImpl service;

    private static  final Logger logger = LoggerFactory.getLogger(LogisticsOrderItemController.class);

    /***
     * 创建订单item
     * @param item
     * @return
     */
    @PostMapping("/orderItem")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO creatOrderItem (@RequestBody LogisticsOrderItem item){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean save = false;
        logger.info("开始创建订单Item");
        try{
            save = service.save(item);
            logger.info("创建订单Item完成,id:{}",item.getId());
        }catch (Exception e){
            logger.error("创建订单Item失败,id:{}",item.getId(),e);
        }
        result.setMsg(save == true ? "true" : "false");
        return result;
    }

    /***
     * 查询订单item
     * @param id
     * @return
     */
    @GetMapping("/orderItem/{id}")
    public ResultVO getOrder(@PathVariable("id") long id){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setData(service.getById(id));
        return resultVO;
    }

    /***
     * 删除订单item
     * @param id
     * @return
     */
    @DeleteMapping("/orderItem/{id}")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO deleteOrder(@PathVariable("id") long id){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean delete = false;
        logger.info("开始删除订单Item");
        try{
            delete = service.removeById(id);
            logger.info("删除订单Item完成,id:{}",id);
        }catch (Exception e){
            logger.error("删除订单Item失败,id:{}",id,e);
        }
        result.setMsg(delete == true ? "true" : "false");
        return result;
    }

    /***
     * 更新订单item
     * @param item
     * @return
     */
    @PutMapping("/orderItem")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO updateOrder(@RequestBody LogisticsOrderItem item){
        ResultVO result = new ResultVO();
        result.setCode(200);

        boolean update = false;
        logger.info("开始更新订单Item");
        try{
            update = service.updateById(item);
            logger.info("更新订单Item完成,id:{}",item.getId());
        }catch (Exception e){
            logger.error("更新订单Item失败,id:{}失败",item.getId(),e);
        }
        result.setMsg(update == true ? "true" : "false");
        return result;
    }

}

