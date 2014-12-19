package ru.javawebinar.webapp.model;

import java.util.Date;

public class EventDescription {

    private String name = "";
    private String description = "";
    private Date dateBeginEvent = null;
    private Date dateEndEvent = null;

    public EventDescription(String name, String description, Date dateBeginEvent, Date dateEndEvent) {
        this.name = name;
        this.description = description;
        this.dateBeginEvent = dateBeginEvent;
        this.dateEndEvent = dateEndEvent;
    }

    public EventDescription() {
        String name = "Empty description";
        String description = "";
        Date dateBeginEducation = null;
        Date dateEndEducation = null;
    }

    public String getName() { return name;  }

    public void setName(String name) { this.name = name;  }

    public String getDescription() {  return description;   }

    public void setDescription(String description) { this.description = description;  }

    public Date getDateBeginEvent() { return dateBeginEvent;  }

    public void setDateBeginEvent(Date dateBeginEvent) {
        this.dateBeginEvent = dateBeginEvent;
    }

    public Date getDateEndEvent() {
        return dateEndEvent;
    }

    public void setDateEndEvent(Date dateEndEvent) {
        this.dateEndEvent = dateEndEvent;
    }
}
