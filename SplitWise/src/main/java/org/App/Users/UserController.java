package org.App.Users;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private List<User> userList;

    public UserController(){
     userList = new ArrayList<User>();
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public void getUser(User user){
        if (userList.contains(user))
            userList.get(userList.indexOf(user));
        else {
            System.out.println("User not found");
        }
    }


}
