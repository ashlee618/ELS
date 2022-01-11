package com.example.elsorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
 * @since 2022-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LogisticsOrder对象", description="")
public class LogisticsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "物流单号")
    private String lgOrderCode;

    @ApiModelProperty(value = "交易单号")
    private String tradeOrderCode;

    @ApiModelProperty(value = "收货人ID")
    private Long receiverId;

    @ApiModelProperty(value = "收货人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收货人电话")
    private String receiverTelephone;

    @ApiModelProperty(value = "收货人省份")
    private String receiverProvince;

    @ApiModelProperty(value = "收货人城市")
    private String receiverCity;

    @ApiModelProperty(value = "收货人地区")
    private String receiverArea;

    @ApiModelProperty(value = "收货人街道")
    private String receiverStreet;

    @ApiModelProperty(value = "收货人详细地址")
    private String receiverAddress;

    @ApiModelProperty(value = "四级地址编码")
    private String receiverAddressCode;

    @ApiModelProperty(value = "发货人ID")
    private Long senderId;

    @ApiModelProperty(value = "发货人姓名")
    private String senderName;

    @ApiModelProperty(value = "发货人电话")
    private String senderTelephone;

    @ApiModelProperty(value = "发货人省份")
    private String senderProvince;

    @ApiModelProperty(value = "发货人城市")
    private String senderCity;

    @ApiModelProperty(value = "发货人地区")
    private String senderArea;

    @ApiModelProperty(value = "发货人街道")
    private String senderStreet;

    @ApiModelProperty(value = "发货人详细地址")
    private String senderAddress;

    @ApiModelProperty(value = "四级地址编码")
    private String senderAddressCode;

    @ApiModelProperty(value = "买家ID")
    private Long buyerId;

    @ApiModelProperty(value = "买家昵称")
    private String buyerName;

    @ApiModelProperty(value = "卖家ID")
    private Long sellerId;

    @ApiModelProperty(value = "卖家昵称")
    private String sellerName;

    @ApiModelProperty(value = "父物流单号")
    private String parentLgOrderCode;

    @ApiModelProperty(value = "业务类型")
    private String bizType;

    @ApiModelProperty(value = "订单来源")
    private Integer orderOrigin;

    @ApiModelProperty(value = "订单类型")
    private Integer orderType;

    @ApiModelProperty(value = "状态")
    @TableField(fill = FieldFill.INSERT)
    private Integer status;

    @ApiModelProperty(value = "运单号")
    private String mailno;

    @ApiModelProperty(value = "快递公司编码")
    private String expressCode;

    @ApiModelProperty(value = "快递公司名称")
    private String expressName;

    @ApiModelProperty(value = "是否删除")
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "扩展字段，JSON格式")
    private String feature;

    @ApiModelProperty(value = "版本号，用于乐观锁")
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer version;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreated;

    @ApiModelProperty(value = "编辑时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
