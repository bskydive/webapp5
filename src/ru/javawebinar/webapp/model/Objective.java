package ru.javawebinar.webapp.model;

public class Objective {

    private String nameObjective = "";
    private Double salaryObjective = 0.0;

    public Objective(String nameObjective, Double salaryObjective) {
        this.nameObjective = nameObjective;
        this.salaryObjective = salaryObjective;
    }

    public Objective() {
        this("Empty Objective", 0.0);
    }

    public String getNameObjective() {
        return nameObjective;
    }

    public void setNameObjective(String nameObjective) {
        this.nameObjective = nameObjective;
    }

    public Double getSalaryObjective() {
        return salaryObjective;
    }

    public void setSalaryObjective(Double salaryObjective) {
        this.salaryObjective = salaryObjective;
    }
}
