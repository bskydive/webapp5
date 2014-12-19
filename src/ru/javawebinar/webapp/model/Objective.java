package ru.javawebinar.webapp.model;

public class Objective {

    private String nameObjective = "";

    public Objective(String nameObjective) {
        this.nameObjective = nameObjective;
    }

    public Objective() {
        this("Empty Objective");
    }

    public String getNameObjective() {
        return nameObjective;
    }

    public void setNameObjective(String nameObjective) {
        this.nameObjective = nameObjective;
    }

}
