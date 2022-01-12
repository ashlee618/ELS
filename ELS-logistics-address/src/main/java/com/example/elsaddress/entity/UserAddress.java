package com.example.elsaddress.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserAddress对象", description="")
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "店铺ID")
    private Long shopId;

    @ApiModelProperty(value = "用户类型：1买家，2卖家")
    private Integer userType;

    @ApiModelProperty(value = "手机号")
    private String telephone;

    @ApiModelProperty(value = "座机号")
    private String phone;

    @ApiModelProperty(value = "国家，默认CN")
    private String country;

    @ApiModelProperty(value = "省份名称")
    private String province;

    @ApiModelProperty(value = "省份code")
    private String provinceCode;

    @ApiModelProperty(value = "城市名称")
    private String city;

    @ApiModelProperty(value = "城市code")
    private String cityCode;

    @ApiModelProperty(value = "地区名称")
    private String area;

    @ApiModelProperty(value = "地区code")
    private String areaCode;

    @ApiModelProperty(value = "街道名称")
    private String street;

    @ApiModelProperty(value = "街道code")
    private String streetCode;

    @ApiModelProperty(value = "详细地址")
    private String detailAddress;

    @ApiModelProperty(value = "最小code")
    private String addressCode;

    @ApiModelProperty(value = "是否默认，1默认，2非默认")
    private Integer isDefault;

    @ApiModelProperty(value = "语言，默认ZH_CN")
    private String language;

    @ApiModelProperty(value = "邮编")
    private String postCode;

    @ApiModelProperty(value = "版本号")
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer version;

    @ApiModelProperty(value = "扩展字段")
    private String feature;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreated;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
