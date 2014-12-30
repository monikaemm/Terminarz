package com.github;

import java.util.Date;

public class Term {

    private Date date;
    private String description;
    private boolean busy;

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

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public String toString() {
        return "{" +
                "date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
