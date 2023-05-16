package org.App.Expense.ExpenseSplits;

import org.App.Expense.Expense;
import org.App.Expense.ExpenseSplit;
import org.App.Split.Split;

public class EqualSplit implements ExpenseSplit {
    @Override
    public boolean validateExpense(Expense expense) {

        Double totalAmountPaid = expense.getTotalExpenseAmount();
        Double eachSplitAmount = totalAmountPaid / expense.getSplitList().size();

        //verify if eachsplitAmount is equal to the amount paid by each user
        for(Split split : expense.getSplitList()){
            if(split.getAmountOwed() != eachSplitAmount){
                return false;
            }
        }

        return true;

    }
}
