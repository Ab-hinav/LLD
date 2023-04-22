package ATM.States;

import ATM.ATM;

public class HasCard extends ATMState{

    @Override
    public boolean authenticate(ATM atm, Card card, int pin) {
        if (card.getPin() == pin) {
            atm.setCurrentATMState(new CardAuthenticatedState());
            return true;
        }
        return false;
    }


    @Override
    public void exit(ATM atm) {
        super.exit(atm);
    }

    public void returnCard(ATM atm, Card card) {
        atm.setCurrentATMState(new IdleState());
    }


}
