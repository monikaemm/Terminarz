package com.github.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiluchM on 2015-01-29.
 */
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void register(User user){
        users.add(user);
    }

    public User login(String login, String password){
        for (User user : users) {
            if(user.getLogin() == login && user.getPassword()== password){
                return user;
            }

        }
        return null;
    }
}
