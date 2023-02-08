package org.example.Service;

public class PaymentMethodFactory {


    public static PaymentMethod getPaymentMethod(PaymentType paymentType) {
        switch (paymentType) {
            case CASH:
                return new CashPayment();
            case CARD:
                return new CardPayment();
            default:
                return null;
        }
    }


}
