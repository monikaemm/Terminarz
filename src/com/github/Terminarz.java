package com.github;

import com.github.menu.Menu;
import com.github.menu.MenuElement;

import java.util.Date;
import java.util.List;

public class Terminarz {

    //TODO: homework -> utworzyc klase User reprezentujaca uzytkownika systemu
    // klasa powinna miec pola imie, nazwisko, rok urodzenia, haslo

    public static void main(String[] args) {

        Menu mainMenu = new Menu("File");
        System.out.println(mainMenu.getTitle());
        System.out.println(mainMenu.getMenuNotification());
        mainMenu.setMenuNotification("ikona");
        System.out.println(mainMenu.getMenuNotification());

        Menu subMenu = new Menu("Otworz");
        System.out.println(subMenu.getTitle());

        System.out.println(mainMenu.getTitle());

        MenuElement firstElement = new MenuElement("Pierwszy","sciezka do ikony");
        System.out.println(firstElement.getLabel());
        System.out.println(firstElement.getIcon());

        firstElement.setIcon("nowa sciecka");
        System.out.println(firstElement.getIcon());
        System.out.println(firstElement.getIcon());

        mainMenu.add(firstElement);
        mainMenu.add(firstElement);
        mainMenu.add(firstElement);


    }


}
