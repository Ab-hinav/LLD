import { PaymentService } from "../interfaces/PaymentService";
import { Cash } from "../paymentMethods/Cash";
import { CreditCard } from "../paymentMethods/CreditCard";
import { PaymentMethods } from "../paymentMethods/PaymentMethods";






export class PaymentServiceImpl implements PaymentService{
   
   
    acceptCash(amount: number): void {
       let cash:PaymentMethods = new Cash();
       cash.initiatePayment(amount);
    }
    acceptCreditCard(cardNumber: String, cvv: number, amount: number): void {
        let crediCard:PaymentMethods = new CreditCard(cardNumber,cvv);
        crediCard.initiatePayment(amount);
    }


    

}



