package com.hao.teamjob.config;

import lombok.Getter;

@Getter
public enum LoginType {
    /**
     * 跳转
     */
    REDIRECT,

    /**
     * 返回JSON
     */
    JSON
}
