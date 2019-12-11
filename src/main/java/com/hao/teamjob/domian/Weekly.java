package com.hao.teamjob.domian;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haohj
 * @date 2019-12-11 10:28
 */
@ApiModel
@Data
public class Weekly implements Serializable {
    @ApiModelProperty("周报id")
    private String id;
    @ApiModelProperty("用户id")
    private String userId;
    @ApiModelProperty("周数")
    private String week;
    @ApiModelProperty("本周工作")
    private String thisWeekReport;
    @ApiModelProperty("下周工作")
    private String nextWeekReport;
    @ApiModelProperty("感想")
    private String feeling;
    @ApiModelProperty("创建时间")
    private Date dateCreate;
    @ApiModelProperty("更新时间")
    private Date dateUpdate;
    private String group;
}
