package com.accenture.project.controller;
import com.accenture.project.model.Project;
import com.accenture.project.service.implementation.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectServiceImpl pServiceImpl;

    @GetMapping("/projects")
    public List<Project> getAllProjects() {

        return pServiceImpl.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Project getProjectById(@PathVariable String id){
        return pServiceImpl.getProject(id);
    }

    @PostMapping("/projects")
    public Project addProject(@RequestBody Project p){
        return pServiceImpl.addProject(p);
    }

    @PutMapping("/projects/{id}")
    public Project updateProject(@RequestBody Project p, @PathVariable String id){
        return pServiceImpl.updateProject(p, id);
    }

    @DeleteMapping("/projects/{id}")
    public List<Project> deleteProject(@PathVariable String id){
        return pServiceImpl.deleteProject(id);
    }
}
