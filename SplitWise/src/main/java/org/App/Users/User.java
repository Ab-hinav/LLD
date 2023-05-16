package org.App.Users;

public class User {

    String name;
    Integer id;

    UserBalanceSheet userBalanceSheet;

    public User(String name, Integer id){
        this.name = name;
        this.id = id;
        userBalanceSheet = new UserBalanceSheet();
    }




}
