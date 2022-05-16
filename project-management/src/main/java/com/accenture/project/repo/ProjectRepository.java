package com.accenture.project.repo;

import com.accenture.project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
}
