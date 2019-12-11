package com.hao.teamjob.domian;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author haohj
 * @date 2019-12-11 10:26
 */
@Data
public class GitCommitLogs implements Serializable {
    private String id;
    private String project;
    private String projectName;
    private String author;
    private String yearweek;
    private Integer totalAddLines;
    private Integer totalDelLines;
    private String commitId;
    private Date dateCommit;
    private String commitComment;
    private int commitType;
    private String group;
}
