package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;


    public Job() {
    }

    public Job( List<Skill> someSkills, Employer employer) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    public void addSkill(Skill skill) {

        this.skills.add(skill);
    }

    // Getters and setters.

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

    public List<Skill> getSkills() {

        return skills;
    }

    public void setSkills(List<Skill> skills) {

        this.skills = skills;
    }

}

