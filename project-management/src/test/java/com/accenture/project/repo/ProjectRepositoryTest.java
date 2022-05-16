package com.accenture.project.repo;

import com.accenture.project.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectRepositoryTest {
    @Autowired
    private ProjectRepository pRepo;

    @Test
    public void create(){
        pRepo.save(new Project("P5","Lime", "Cola", 10, "Java", "P2", "Mumbai"));
        assertNotNull(pRepo.findById("P5"));
    }

    @Test
    public void find(){
        assertEquals("Lime", pRepo.findById("P5").get().getProject_name());
    }

    @Test
    public void find_all(){
        assertThat(pRepo.findAll()).size().isGreaterThan(0);
    }

    @Test
    public void update(){
        Project p = pRepo.findById("P5").get();
        p.setLocation("Hyderabad");
        pRepo.save(p);
        System.out.println(pRepo.findById("P5").get().getLocation());
        assertEquals("Hyderabad", pRepo.findById("P5").get().getLocation());
    }

    @Test
    public void delete(){
        pRepo.save(new Project("P7","Coke", "Cola", 10, "Java", "P2", "Mumbai"));
        pRepo.deleteById("P7");
        assertThat(pRepo.existsById("P7")).isFalse();
    }
}