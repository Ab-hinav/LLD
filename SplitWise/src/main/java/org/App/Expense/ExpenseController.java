package org.App.Expense;

import org.App.BalanceSheetController;
import org.App.Split.Split;
import org.App.Split.SplitFactory;
import org.App.Split.SplitType;
import org.App.Users.User;

import java.util.List;

public class ExpenseController {

    SplitFactory splitFactory;
    BalanceSheetController balanceSheetController;

    public ExpenseController(){
        splitFactory = new SplitFactory();
    }

    public void addExpense(String expenseDesription , Double expenseAmount , User paidBy , SplitType splitType , List<Split> splits) {
        Expense expense = new Expense(expenseDesription , expenseAmount , paidBy , splitType , splits);
        ExpenseSplit expenseSplit = splitFactory.getExpenseSplit(splitType);
        if (expenseSplit.validateExpense(expense)) {
            // add to group or user
        }else {
            System.out.println("Invalid Expense");
        }
    }



}
