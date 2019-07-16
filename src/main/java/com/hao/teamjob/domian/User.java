package com.hao.teamjob.domian;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@ApiModel
@Data
@Entity(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 2204702461366606783L;

    @ApiModelProperty("用户id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("用户邮箱")
    private String password;
    @ApiModelProperty("用户电话")
    private String phone;
    @ApiModelProperty("用户生日")
    private Date birthday;
    @ApiModelProperty("用户生日类型")
    private String birthType;
    @ApiModelProperty("用户部门")
    private String department;
    @ApiModelProperty("用户职务")
    private String position;
    @ApiModelProperty("git/svn仓库用户名")
    private String repositoryUsername;
    @ApiModelProperty("用户头像路径")
    private String headUrl;
    @ApiModelProperty("用户创建时间")
    private Date dateCreate;
    @ApiModelProperty("用户更新时间")
    private Date dateUpdate;
    private String group;
}
