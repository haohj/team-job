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
@Data
@ApiModel
public class ProjectTemplate implements Serializable {
    @ApiModelProperty("主键id")
    private String id;
    @ApiModelProperty("名称")
    private String projectName;
    @ApiModelProperty("项目经理")
    private String projectManger;
    @ApiModelProperty("项目级别")
    private String projectLevel;
    @ApiModelProperty("项目属性")
    private String projectProperty;
    @ApiModelProperty("项目需求文档地址")
    private String projectPrd;
    @ApiModelProperty("本项目组成员")
    private String groupMembers;
    @ApiModelProperty("服务端开发人员")
    private String projectServer;
    @ApiModelProperty("前端/客户端开发人员")
    private String projectFront;
    @ApiModelProperty("测试人员")
    private String projectTester;
    @ApiModelProperty("接口评审日期")
    private Date interfaceReview;
    @ApiModelProperty("用例评审日期")
    private Date caseReview;
    @ApiModelProperty("接口测试日期")
    private Date interfaceTest;
    @ApiModelProperty("整体测试日期")
    private Date allTest;
    @ApiModelProperty("预发日期")
    private Date preDate;
    @ApiModelProperty("上线日期")
    private Date productDate;
    @ApiModelProperty("项目描述")
    private String content;
    @ApiModelProperty("延期备注")
    private String remark;
    @ApiModelProperty("创建时间")
    private Date createDate;
    @ApiModelProperty("更新时间")
    private Date updateDate;
    @ApiModelProperty("创建人")
    private String owner;
    @ApiModelProperty("所属项目组")
    private String group;
}
