import { PaymentMethods } from "./PaymentMethods";




export class CreditCard implements PaymentMethods {


    private _cardNumber: String;
    private _cvv: number;

    constructor(cardNumber: String, cvv: number) {
        this._cardNumber = cardNumber;
        this._cvv = cvv;
    }

    initiatePayment(amount: number): boolean {
        return false; 
    }




}

