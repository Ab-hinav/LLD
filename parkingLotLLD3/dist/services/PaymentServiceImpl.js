import { Cash } from "../paymentMethods/Cash";
import { CreditCard } from "../paymentMethods/CreditCard";
export class PaymentServiceImpl {
    acceptCash(amount) {
        let cash = new Cash();
        cash.initiatePayment(amount);
    }
    acceptCreditCard(cardNumber, cvv, amount) {
        let crediCard = new CreditCard(cardNumber, cvv);
        crediCard.initiatePayment(amount);
    }
}
