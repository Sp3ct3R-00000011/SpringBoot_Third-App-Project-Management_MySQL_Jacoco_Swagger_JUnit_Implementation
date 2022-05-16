package com.accenture.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @Column(name="id", nullable = false)
    private String pID;
    private String project_name;
    private String client_name;
    private int career_lvl;
    private String skill_required;
    private String proficiency_required;
    private String location;

    public Project(){

    }
    public Project(String pID, String project_name, String client_name, int career_lvl, String skill_required, String proficiency_required, String location) {
        this.pID = pID;
        this.project_name = project_name;
        this.client_name = client_name;
        this.career_lvl = career_lvl;
        this.skill_required = skill_required;
        this.proficiency_required = proficiency_required;
        this.location = location;
    }


    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getCareer_lvl() {
        return career_lvl;
    }

    public void setCareer_lvl(int career_lvl) {
        this.career_lvl = career_lvl;
    }

    public String getSkill_required() {
        return skill_required;
    }

    public void setSkill_required(String skill_required) {
        this.skill_required = skill_required;
    }

    public String getProficiency_required() {
        return proficiency_required;
    }

    public void setProficiency_required(String proficiency_required) {
        this.proficiency_required = proficiency_required;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
