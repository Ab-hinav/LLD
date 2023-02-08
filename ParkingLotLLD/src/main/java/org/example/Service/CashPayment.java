package org.example.Service;

public class CashPayment implements PaymentMethod {
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
}
