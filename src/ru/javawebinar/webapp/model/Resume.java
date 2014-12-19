package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Resume {
    private String fullName="";
    private String email="";
    private String telephone="";
    private Date birthDate=null;

    private List<Experience> listExperience = null;
    private List<Education> listEducation = null;
    private Achievement achievement = null;
    private Qualifications qualifications = null;
    private Objective objective = null;

    public Resume(String fullName, String email, String telephone, Date birthDate, List<Experience> listExperience, List<Education> listEducation, Achievement achievement, Qualifications qualifications, Objective objective) {
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
        this.birthDate = birthDate;
        this.listExperience = listExperience;
        this.listEducation = listEducation;
        this.achievement = achievement;
        this.qualifications = qualifications;
        this.objective = objective;
    }

    public Resume() {
        this.fullName = "Empty Full Name";
        this.email = "Empty Email";
        this.telephone = "Empty Telephone";
        this.birthDate = new Date();
        this.listExperience = new ArrayList<>();
        this.listEducation = new ArrayList<>();
        this.achievement = new Achievement();
        this.qualifications = new Qualifications();
        this.objective =  new Objective();
    }

    public void printContacts() {
        System.out.println("Full Name: "+fullName);
        System.out.println("email: "+email);
        System.out.println("telephone: "+telephone);
        System.out.println("Birth Date: "+birthDate);
    }

    public void printObjective() {
        System.out.println(objective.getNameObjective());
    }

    public void printListExperience() {

        if (listExperience!=null)
        for (int i=0;i<listExperience.size();i++){
            System.out.println(listExperience.get(i));
        }

    }

    public void printEducation() {
        if (listEducation!=null)
            for (int i=0;i<listEducation.size();i++){
                System.out.println(listEducation.get(i));
            }
    }

    public void printAchievement() {
        if (achievement!=null)
            for (int i=0;i<achievement.getListDescription().size();i++){
                System.out.println(achievement.getListDescription().get(i));
            }
    }

    public void printQualifications() {
        if (qualifications!=null)
            for (int i=0;i<qualifications.getListDescription().size();i++){
                System.out.println(qualifications.getListDescription().get(i));
            }
    }

    public static void main(String[] args) {

        Resume resume = new Resume();

        final int maxInd=5;

        for (int i=0;i<maxInd;i++){

        }

        System.out.println("CONTACTS");
        resume.printContacts();
        System.out.println("");

        System.out.println("OBJECTIVE");
        resume.printObjective();
        System.out.println("");

        System.out.println("ACHIEVEMENT");
        resume.printAchievement();
        System.out.println("");

        System.out.println("EDUCATION");
        resume.printEducation();
        System.out.println("");

        System.out.println("QUALIFICATION");
        resume.printQualifications();
        System.out.println("");

        System.out.println("EXPERIENCE");
        resume.printListExperience();
        System.out.println("");


    }

}
