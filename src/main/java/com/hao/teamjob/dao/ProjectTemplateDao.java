package com.hao.teamjob.dao;

import com.hao.teamjob.domain.ProjectTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectTemplateDao {
    void add(ProjectTemplate projectTemplate);

    void update(ProjectTemplate projectTemplate);

    List<ProjectTemplate> getAllProjectte();

    ProjectTemplate getProjectById(String id);
}
