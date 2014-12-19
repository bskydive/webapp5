package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Resume {
    String fullName;
    Collection<String> collection;

    private List<Experience> listExperience = new ArrayList<>();
    private List<Education> listEducation = new ArrayList<>();
    private Achievement achievement = new Achievement();
    private Qualifications qualifications = new Qualifications();

    public static void main(String[] args) {

    }

}
