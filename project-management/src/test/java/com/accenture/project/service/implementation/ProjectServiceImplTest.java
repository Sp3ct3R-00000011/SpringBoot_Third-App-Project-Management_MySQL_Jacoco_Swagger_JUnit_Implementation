package com.accenture.project.service.implementation;

import com.accenture.project.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceImplTest {
    @Autowired
    public ProjectServiceImpl pServeImpl;

    @Test
    void addProject() {
        Project temp;
        Project p = new Project("P2","Producto", "HP", 8, "Java", "P2", "Mumbai");
        temp = pServeImpl.addProject(p);
        assertNotNull(temp);
    }

    @Test
    void getAllProjects() {
        List<Project> list = pServeImpl.getAllProjects();
        assertNotNull(list, "found");
    }

    @Test
    void getProject() {
        Project p = pServeImpl.getProject("P2");
        assertNotNull(p);
    }

    @Test
    void updateProject() {
        Project p1 = new Project("P2","Accenture", "HP", 8, "Java", "P2", "Mumbai");
        Project temp = pServeImpl.updateProject(p1, "P2");
        assertEquals("Accenture", temp.getProject_name());
    }

    @Test
    void updateProject_with_diff_approach() {
        Project p1 = new Project();
        Project temp = pServeImpl.updateProject(p1, "P2");
        assertEquals("Accenture", temp.getProject_name());
    }

    @Test
    void deleteProject() {
        Project p = new Project("P9","Producto", "HP", 8, "Java", "P2", "Mumbai");
        pServeImpl.addProject(p);
        List<Project> list = pServeImpl.deleteProject("P9");
        assertNotNull(list);
    }
}