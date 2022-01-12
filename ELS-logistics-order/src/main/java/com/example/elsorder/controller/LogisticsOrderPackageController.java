package com.example.elsorder.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.example.elslogisticscommon.entry.ResultVO;
import com.example.elsorder.entity.LogisticsOrder;
import com.example.elsorder.entity.LogisticsOrderItem;
import com.example.elsorder.entity.LogisticsOrderPackage;
import com.example.elsorder.service.impl.LogisticsOrderPackageServiceImpl;
import com.example.elsorder.service.impl.LogisticsOrderServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-02
 */
@RestController
@RequestMapping("/logistics-order-package/v1")
public class LogisticsOrderPackageController {

    @Autowired
    public LogisticsOrderPackageServiceImpl service;

    public static final Logger logger = LoggerFactory.getLogger(LogisticsOrderPackageController.class);

    /***
     * 创建订单Package
     * @param orderPackage
     * @return
     */
    @PostMapping("/orderPackage")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO creatOrderItem (@RequestBody LogisticsOrderPackage orderPackage){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean save = false;
        logger.info("开始创建订单Package");
        try{
            save = service.save(orderPackage);
            logger.info("创建订单Package完成,id:{}",orderPackage.getId());
        }catch (Exception e){
            logger.error("创建订单Package失败,id:{}",orderPackage.getId(),e);
        }
        result.setMsg(save == true ? "true" : "false");
        return result;
    }

    /***
     * 查询订单Package
     * @param id
     * @return
     */
    @GetMapping("/orderPackage/{id}")
    public ResultVO getOrder(@PathVariable("id") long id){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setData(service.getById(id));
        return resultVO;
    }

    /***
     * 删除订单Package
     * @param id
     * @return
     */
    @DeleteMapping("/orderPackage/{id}")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO deleteOrder(@PathVariable("id") long id){
        ResultVO result = new ResultVO();
        result.setCode(200);

        boolean delete = false;
        logger.info("开始删除订单Package");
        try{
            delete = service.removeById(id);
            logger.info("删除订单Package完成,id:{}",id);
        }catch (Exception e){
            logger.error("删除订单Package失败,id:{}",id,e);
        }
        result.setMsg(delete == true ? "true" : "false");
        return result;
    }

    /***
     * 更新订单Package
     * @param Package
     * @return
     */
    @PutMapping("/orderPackage")
    @Transactional(rollbackFor = RuntimeException.class)
    public ResultVO updateOrder(@RequestBody LogisticsOrderPackage Package){
        ResultVO result = new ResultVO();
        result.setCode(200);
        boolean update = false;
        logger.info("开始更新订单Package");
        try{
            update = service.updateById(Package);
            logger.info("更新订单Package完成,id:{}",Package.getId());
        }catch (Exception e){
            logger.error("更新订单Package失败,id:{}",Package.getId(),e);
        }
        result.setMsg(update == true ? "true" : "false");
        return result;
    }
}

