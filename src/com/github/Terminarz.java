package com.github;

import com.github.menu.Menu;
import com.github.menu.MenuElement;
import com.github.user.Address;
import com.github.user.User;
import com.github.user.UserRepository;

import javax.swing.*;

public class Terminarz {

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
        mainMenu.add(firstElement);
        mainMenu.add(firstElement);

        System.out.println(mainMenu.getView());
    }


}
