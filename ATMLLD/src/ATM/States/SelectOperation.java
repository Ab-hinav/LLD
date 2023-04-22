package ATM.States;
import ATM.*;
public class SelectOperation extends ATMState{

    public SelectOperation(){
        showOperations();
    }

    public void selectOperation(ATM atm , Card card , TransactionType transactionType){

        switch (transactionType) {
            case WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawalState());
                break;
            case BALANCE:
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation");
                exit(atm);
        }
    }


    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
    }

    public void returnCard(){
        System.out.println("Card returned");
    }

    public void showOperations(){
        System.out.println("Please Select the operations");
        TransactionType.showAllTransactionTypes();
    }


}
