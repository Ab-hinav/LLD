





export interface PaymentService {

    acceptCash(amount:number) : void;
    acceptCreditCard(cardNumber:String,cvv:number,amount:number) : void;


}