package com.example.elsorder.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-02
 */
@RestController
@RequestMapping("/logistics-order-package")
public class LogisticsOrderPackageController {


    @GetMapping("/hi")
    public String hi (){
        return "hi";
    }
}

