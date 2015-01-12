package com.github.menu;

/**
 * Created by MiluchM on 2015-01-12.
 */
public class MenuElement {

    //TODO: dodac nazwe ikony, nazwa nie moze byc modyfikowalna

    private String label;

    public MenuElement(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
