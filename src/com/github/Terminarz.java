package com.github;

import com.github.menu.Menu;
import com.github.menu.MenuElement;

import java.util.Date;
import java.util.List;

public class Terminarz {
    public static void main(String[] args) {

        Menu mainMenu = new Menu("File");
        System.out.println(mainMenu.getTitle());

        Menu subMenu = new Menu("Otworz");
        System.out.println(subMenu.getTitle());

        System.out.println(mainMenu.getTitle());

        MenuElement firstElement = new MenuElement("Pierwszy");
        System.out.println(firstElement.getLabel());

        mainMenu.add(firstElement);
        mainMenu.add(firstElement);
        mainMenu.add(firstElement);


    }


}
