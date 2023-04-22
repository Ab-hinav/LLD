package ATM.States;

public class CashWithdrawalState extends ATMState{

   public void cashWithdrawal(ATM atmObj,Card card,int amount){
       System.out.println("Cash Withdrawal");
   }

    public void exit(ATM atm){
         returnCard();
         atm.setState(new IdleState());
    }

    public void returnCard(){
        System.out.println("Card returned");
    }

}
