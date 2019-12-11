package com.hao.teamjob.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author haohj
 * @date 2019-12-11 10:15
 */
@Data
public class Result implements Serializable {
    private boolean isSuccess = true;
    private String mes = "success";
    private Object data;
}
