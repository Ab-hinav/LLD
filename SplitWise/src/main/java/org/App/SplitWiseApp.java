package org.App;

import org.App.Group.GroupController;
import org.App.Users.UserController;

public class SplitWiseApp {

    UserController userController;
    GroupController groupController;

    public SplitWiseApp(){
        userController = new UserController();
        groupController = new GroupController();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}