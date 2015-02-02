package com.github.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiluchM on 2015-01-12.
 */
public class Menu {

    private String menuNotification;
    private String title;
    private List<MenuElement> elements = new ArrayList<>();

    public Menu(String title){
        this.title = title;
        this.menuNotification = " * "+title+" * ";
    }

    public String getTitle() {
        return title;
    }

    public void add(MenuElement element){
        elements.add(element);
    }

    public String getMenuNotification(){
        return menuNotification;
    }

    public void setMenuNotification(String notification){
        this.menuNotification = notification;
    }

    public String getView() {
        String result = title;
        result += "\n---------";
        int number = 1;

        for (MenuElement element : elements) {
            String oneElement = element.getLabel();
            result += "\n" + number + ". " + oneElement;
            number++;
        }
        return result;
    }
}
