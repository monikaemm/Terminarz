package com.github.menu;

/**
 * Created by MiluchM on 2015-01-12.
 */
public class MenuElement {


    private String icon;
    private String label;

    public MenuElement(String label, String icon) {

        this.label = label;
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public String getIcon(){return icon;}

    public void setIcon(String icon){
        this.icon = icon;
    }
}
