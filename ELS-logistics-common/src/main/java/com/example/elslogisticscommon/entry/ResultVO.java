package com.example.elslogisticscommon.entry;

import com.example.elslogisticscommon.constants.enums.ResultCode;
import lombok.Data;
/**
 * @author D-L
 * @Version 1.0
 * @Description 响应体实体类
 * @Date 2020/8/26
 */

@Data
public class ResultVO<T> {
    /**
     * 状态码，比如200代表响应成功
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;
    /**
     * 响应的具体数据
     */
    private T data;

    public ResultVO() {

    }

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}