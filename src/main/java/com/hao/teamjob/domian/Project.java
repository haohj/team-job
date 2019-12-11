package com.hao.teamjob.domian;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haohj
 * @date 2019-12-11 10:27
 */
@ApiModel
@Data
public class Project implements Serializable {
    @ApiModelProperty("项目id")
    private String id;
    @ApiModelProperty("项目中文名")
    private String projectRealName;
    @ApiModelProperty("项目名")
    private String projectName;
    @ApiModelProperty("项目仓库类型")
    private Integer repositoryType;
    @ApiModelProperty("项目仓库地址")
    private String repositoryUrl;
    @ApiModelProperty("项目文档地址")
    private String documentUrl;
    @ApiModelProperty("线上数据库地址")
    private String databaseUrl;
    @ApiModelProperty("开发者")
    private String coders;
    @ApiModelProperty("创建者")
    private String optioner;
    @ApiModelProperty("项目创建时间")
    private Date projectDateCreate;
    @ApiModelProperty("创建时间")
    private Date dateCreate;
    @ApiModelProperty("更新时间")
    private Date dateUpdate;
    private String group;
}
