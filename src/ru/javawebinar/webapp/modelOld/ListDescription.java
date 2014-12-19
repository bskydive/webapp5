package ru.javawebinar.webapp.modelOld;

import java.util.ArrayList;

public class ListDescription {
    private ArrayList<String> listDescription = new ArrayList<>();

    public ListDescription(ArrayList<String> listDescription) {

        this.listDescription = listDescription;
    }

    public ListDescription() {
//        this.listDescription.add(this.listDescription.size()+". Empty Description");
    }

    public ArrayList<String> getListDescription() {

        return listDescription;
    }

    public void setListDescription(ArrayList<String> listDescription) {

        this.listDescription = listDescription;
    }

    public void addListDescription(String listDescription) {

        this.listDescription.add(listDescription);
    }
}
