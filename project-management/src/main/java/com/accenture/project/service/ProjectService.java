package com.accenture.project.service;

import com.accenture.project.model.Project;

import java.util.List;

public interface ProjectService {

    Project addProject(Project employee);
    List<Project> getAllProjects();
    Project getProject(String empID);

    Project updateProject(Project emp, String empID);
    List<Project> deleteProject(String empID);
}
