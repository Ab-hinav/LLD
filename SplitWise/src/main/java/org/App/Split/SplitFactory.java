package org.App.Split;

import org.App.Expense.ExpenseSplit;
import org.App.Expense.ExpenseSplits.EqualSplit;
import org.App.Expense.ExpenseSplits.PercentageSplit;
import org.App.Expense.ExpenseSplits.UnequalSplit;

public class SplitFactory {

    public ExpenseSplit getExpenseSplit(SplitType splitType){
        switch(splitType){
            case EQUAL:
                return new EqualSplit();
            case UNEQUAL:
                return new UnequalSplit();
            case PERCENTAGE:
                return new PercentageSplit();
            default:
                return null;
        }
    }



}
