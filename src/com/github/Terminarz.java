package com.github;

import com.github.menu.Menu;
import com.github.menu.MenuElement;
import com.github.user.Address;
import com.github.user.User;
import com.github.user.UserRepository;

public class Terminarz {

    //TODO: homework -> utworzyc klase Address reprezentujaca adres pocztowy (ulica, numer domu, numer mieszkania,miasto)
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

        User user1 = new User("Mateusz","Papadryl");
        user1.setName("Zenon");
        System.out.println(user1.getName());
        System.out.println(user1.getSurname());
        user1.setBirthyear(15);
        System.out.println(user1.getBirthyear());
        System.out.println(user1);
        user1.setLogin("uzyszkod");
        System.out.println(user1.getLogin());
        user1.setPassword("1234wow");

        User user2 = new User("Marcin", "Ptaszynski");
        user2.setLogin("marcin123");
        user2.setPassword("1234tralal");
        UserRepository userRepo = new UserRepository();
        System.out.println(userRepo.getUsers());

        userRepo.register(user1);
        userRepo.register(user2);
        System.out.println(userRepo.getUsers());

        User user3 = userRepo.login("uzyszkod","1234wow");
        System.out.println(user3);


        Address adres1 = new Address("Lokietka","3a","8","Chojnow");
        String adrestmp = adres1.getApartmentNumber();
        System.out.println(adrestmp);

    }


}
