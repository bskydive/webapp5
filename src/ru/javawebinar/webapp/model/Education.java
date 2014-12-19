package ru.javawebinar.webapp.model;

import java.util.Date;

public class Education extends EventDescription {

    public Education() {

        this("Empty Education Owner", "Empty Education Description", new Date());
    }

    public Education(String name, String description, Date dateEndEvent) {
        super(name, description, null, dateEndEvent);
    }
}
