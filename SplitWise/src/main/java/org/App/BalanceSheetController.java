package org.App;

import org.App.Split.Split;
import org.App.Users.User;
import org.App.Users.UserBalanceSheet;

import java.util.List;

public class BalanceSheetController {


    public void updateUserExpenseBalanceSheet(User paidBy, List<Split> splits, double totalExpenseAmount){

        UserBalanceSheet userPaidByBalanceSheet = paidBy.getUserBalanceSheet();


    }



}
