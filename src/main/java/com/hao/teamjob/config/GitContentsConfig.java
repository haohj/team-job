package com.hao.teamjob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 统计git提交代码量
 *
 * @author haohj
 * @date 2019-12-11 14:43
 */
@Component
@ConfigurationProperties(prefix = "git")
public class GitContentsConfig {
    private String basePath;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
