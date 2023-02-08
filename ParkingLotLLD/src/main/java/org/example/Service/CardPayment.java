package org.example.Service;

public class CardPayment implements PaymentMethod {
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
}
