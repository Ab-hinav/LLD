package ATM.States;
import ATM.Card;
import ATM.ATM;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("Operation not allowed");
    }

    public boolean authenticate(ATM atm, Card card, int pin) {
        System.out.println("Operation not allowed");
        return false;
    }

    public void selectOperation(ATM atm,Card card,TransactionType transactionType) {
        System.out.println("Operation not allowed");
    }

    public void cashWithdrawal(ATM atm,Card card,int amount) {
        System.out.println("Operation not allowed");
    }

    public void displayBalance(ATM atm,Card card) {
        System.out.println("Operation not allowed");
    }

    public void returnCard() {
        System.out.println("Operation not allowed");
    }

    public void exit(ATM atm){
        System.out.println("Operation not allowed");}





}
