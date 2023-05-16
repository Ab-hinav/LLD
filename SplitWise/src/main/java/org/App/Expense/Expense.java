package org.App.Expense;

import org.App.Split.Split;
import org.App.Split.SplitType;
import org.App.Users.User;

import java.util.List;

public class Expense {

    Integer expenseId;
    String description;
    Double expenseAmount;

    User paidBy;

    SplitType splitType;

    List<Split> splitList;

    public Expense(String description , Double expenseAmount , User paidBy , SplitType splitType , List<Split> splitList){
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.splitList = splitList;
    }


    public Double getTotalExpenseAmount(){
        return expenseAmount;
    }

    public List<Split> getSplitList(){
        return splitList;
    }



}
