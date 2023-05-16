package org.App.Group;

import org.App.Expense.Expense;
import org.App.Expense.ExpenseController;
import org.App.Users.User;

import java.util.List;

public class Group {

    String groupName;
    Integer groupId;

    List<User> userList;

    List<Expense> expenseList;

    ExpenseController expenseController;

}
