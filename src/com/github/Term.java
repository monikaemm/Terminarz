package com.github;

import java.util.Date;

public class Term {

    private Date date;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
