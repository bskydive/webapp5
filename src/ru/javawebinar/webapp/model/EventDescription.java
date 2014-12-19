package ru.javawebinar.webapp.model;

import java.util.Date;

public class EventDescription {

    private String name = "";
    private String description = "";
    private Date dateBeginEducation = null;
    private Date dateEndEducation = null;

    public EventDescription(String name, String description, Date dateBeginEducation, Date dateEndEducation) {
        this.name = name;
        this.description = description;
        this.dateBeginEducation = dateBeginEducation;
        this.dateEndEducation = dateEndEducation;
    }

    public EventDescription() {
        String name = "Empty description";
        String description = "";
        Date dateBeginEducation = null;
        Date dateEndEducation = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateBeginEducation() {
        return dateBeginEducation;
    }

    public void setDateBeginEducation(Date dateBeginEducation) {
        this.dateBeginEducation = dateBeginEducation;
    }

    public Date getDateEndEducation() {
        return dateEndEducation;
    }

    public void setDateEndEducation(Date dateEndEducation) {
        this.dateEndEducation = dateEndEducation;
    }
}
