package com.accenture.project.controller;

import com.accenture.project.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectControllerTest {
    @Autowired
    private ProjectController pCon;

    @Test
    void getAllProjects() {
        List<Project> list = pCon.getAllProjects();
        assertNotNull(list, "found");
    }

    @Test
    void getProjectById() {
        Project p = pCon.getProjectById("P2");
        assertNotNull(p);
    }

    @Test
    void addProject() {
        Project temp;
        Project p = new Project("P2","Producto", "HP", 8, "Java", "P2", "Mumbai");
        temp = pCon.addProject(p);
        assertNotNull(temp);
    }

    @Test
    void updateProject() {
        Project p1 = new Project("P2","Accenture", "HP", 8, "Java", "P2", "Mumbai");
        Project temp = pCon.updateProject(p1, "P2");
        assertEquals("Accenture", temp.getProject_name());
    }

    @Test
    void deleteProject() {
        List<Project> list = pCon.deleteProject("P2");
        assertNotNull(list);
    }
}