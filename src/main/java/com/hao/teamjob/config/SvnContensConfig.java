package com.hao.teamjob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 从配置文件中读取SVN相关配置
 *
 * @author haohj
 * @date 2019-12-11 14:44
 */
@Component
@ConfigurationProperties(prefix = "svn")
public class SvnContensConfig {
    private String targetPath;
    private String svnUserName;
    private String svnPassWord;

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public String getSvnUserName() {
        return svnUserName;
    }

    public void setSvnUserName(String svnUserName) {
        this.svnUserName = svnUserName;
    }

    public String getSvnPassWord() {
        return svnPassWord;
    }

    public void setSvnPassWord(String svnPassWord) {
        this.svnPassWord = svnPassWord;
    }
}
