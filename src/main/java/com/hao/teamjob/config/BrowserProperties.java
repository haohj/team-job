package com.hao.teamjob.config;

import lombok.Data;

@Data
public class BrowserProperties {
    //如果用户没有配置，则默认跳转到loginPage
    private String loginPage = "/login.html";
    private LoginType loginType = LoginType.JSON;
    private int rememberMeSeconds = 3600;
}
