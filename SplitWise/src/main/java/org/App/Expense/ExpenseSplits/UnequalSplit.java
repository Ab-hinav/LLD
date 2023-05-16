package org.App.Expense.ExpenseSplits;

import org.App.Expense.Expense;
import org.App.Expense.ExpenseSplit;

public class UnequalSplit implements ExpenseSplit {
    @Override
    public boolean validateExpense(Expense expense) {
        return false;
    }
}
