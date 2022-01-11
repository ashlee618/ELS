package com.example.elslogisticscommon.constants.enums;
import lombok.Getter;
/**
 * @author D-L
 * @Version 1.0
 * @Description   响应状态码枚举类
 * @Date 2020/8/26
 */
@Getter
public enum ResultCode {

    SUCCESS(200, "操作成功"),

    FAILED(1001, "响应失败"),

    VALIDATE_FAILED(1002, "参数校验失败"),

    ERROR(5000, "未知错误");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}