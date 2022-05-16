package com.accenture.project.service.implementation;

import com.accenture.project.model.Project;
import com.accenture.project.repo.ProjectRepository;
import com.accenture.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository pRepo;

    @Override
    public Project addProject(Project project) {
        pRepo.save(project);
        return project;
    }

    @Override
    public List<Project> getAllProjects() {
        return pRepo.findAll();
    }

    @Override
    public Project getProject(String pID) {
        return pRepo.findById(pID).get();
    }

    @Override
    public Project updateProject(Project p, String id) {
        Project existProject = pRepo.getById(id);
        Project temp = new Project();
        temp.setpID(id);
        if (p.getProject_name() != null) temp.setProject_name(p.getProject_name());
        else temp.setProject_name(existProject.getProject_name());
        if (p.getLocation() != null) temp.setLocation(p.getLocation());
        else temp.setLocation(existProject.getLocation());
        if (p.getCareer_lvl() != 0) temp.setCareer_lvl(p.getCareer_lvl());
        else temp.setCareer_lvl(existProject.getCareer_lvl());
        if (p.getClient_name() != null) temp.setClient_name(p.getClient_name());
        else temp.setClient_name(existProject.getClient_name());
        if (p.getSkill_required() != null) temp.setSkill_required(p.getSkill_required());
        else temp.setSkill_required(existProject.getSkill_required());
        if (p.getProficiency_required() != null) temp.setLocation(p.getProficiency_required());
        else temp.setProficiency_required(existProject.getProficiency_required());
        pRepo.save(temp);
        return temp;
    }

    @Override
    public List<Project> deleteProject(String pID) {

       pRepo.deleteById(pID);
       return pRepo.findAll();
    }
}