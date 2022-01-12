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
 * 地区设置
 * </p>
 *
 * @author 洪敏锋
 * @since 2022-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="BsArea对象", description="地区设置")
public class BsArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增列")
    @TableId(value = "AREA_ID", type = IdType.AUTO)
    private Integer areaId;

    @ApiModelProperty(value = "区代码")
    @TableField("AREA_CODE")
    private String areaCode;

    @ApiModelProperty(value = "父级市代码")
    @TableField("CITY_CODE")
    private String cityCode;

    @ApiModelProperty(value = "市名称")
    @TableField("AREA_NAME")
    private String areaName;

    @ApiModelProperty(value = "简称")
    @TableField("SHORT_NAME")
    private String shortName;

    @ApiModelProperty(value = "经度")
    @TableField("LNG")
    private String lng;

    @ApiModelProperty(value = "纬度")
    @TableField("LAT")
    private String lat;

    @ApiModelProperty(value = "排序")
    @TableField("SORT")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    @TableField("GMT_CREATE")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "GMT_MODIFIED", fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @ApiModelProperty(value = "备注")
    @TableField("MEMO")
    private String memo;

    @ApiModelProperty(value = "状态")
    @TableField("DATA_STATE")
    private Integer dataState;

    @ApiModelProperty(value = "租户ID")
    @TableField("TENANT_CODE")
    private String tenantCode;


}
