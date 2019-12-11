package com.hao.teamjob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 从配置文件中读取文件上传相关配置
 *
 * @author haohj
 * @date 2019-12-11 14:44
 */
@Component
@ConfigurationProperties(prefix = "fileupload")
public class UploadConfig {
    private String basePath;

    private String imagePath;

    private String videoPath;

    private String musicPath;

    private String officePath;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getMusicPath() {
        return musicPath;
    }

    public void setMusicPath(String musicPath) {
        this.musicPath = musicPath;
    }

    public String getOfficePath() {
        return officePath;
    }

    public void setOfficePath(String officePath) {
        this.officePath = officePath;
    }
}
