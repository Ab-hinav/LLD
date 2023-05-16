package org.App.Split;

import org.App.Users.User;

public class Split {

    User user;
    Double amountOwed;

    public Split(User user, Double amountOwed){
        this.user = user;
        this.amountOwed = amountOwed;
    }

    public double getAmountOwed(){
        return amountOwed;
    }



}
