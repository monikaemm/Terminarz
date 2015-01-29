package com.github.menu;

/**
 * Created by MiluchM on 2015-01-29.
 */
//TODO: homework -> utworzyc klase User reprezentujaca uzytkownika systemu
// klasa powinna miec pola imie, nazwisko, rok urodzenia, haslo
public class User {

    private String name;
    private String surname;
    private int birthyear;
    private String login;
    private String password;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return name +" "+ surname;
    }
}
