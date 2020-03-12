package com.hao.teamjob.dao;

import com.hao.teamjob.domain.GitCommitLogs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GitCommitLogDao {
    void add(List<GitCommitLogs> gitCommitLogs);

    //获取一周的git提交记录
    List<GitCommitLogs> getWeeklyLogs(String yearweek);

    //根据用户获取一周的git提交记录
    List<GitCommitLogs> getWeeklyLogsByAuthor(String username, String yearweek);

    //根据commitid获取提交记录
    GitCommitLogs getLogsByCommitId(String commitId);

    GitCommitLogs getProjectNewestLog(String project);

    List<GitCommitLogs> getLogsByProjectCode(String project);
}
