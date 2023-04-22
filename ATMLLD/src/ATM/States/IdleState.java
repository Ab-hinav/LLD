package ATM.States;

public class IdleState extends ATMState {

    public void insertCard(ATM atm) {
        atm.setCurrentATMState(new CardInsertedState());
    }

}
