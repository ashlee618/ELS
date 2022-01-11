package com.example.elslogisticscommon.entry;

import lombok.Data;
/**
 * @author D-L
 * @Version 1.0
 * @Description 响应体实体类
 * @Date 2020/8/26
 */

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}