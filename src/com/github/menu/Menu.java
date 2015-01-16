package com.github.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiluchM on 2015-01-12.
 */
public class Menu {

    //TODO: dodaj powiadomienie menu, które może byc edytowane


    private String title;
    private List<MenuElement> elements = new ArrayList<>();

    public Menu(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void add(MenuElement element){
        elements.add(element);
        System.out.println("Liczba elementow:" +elements.size());
    }

}
