export class CreditCard {
    constructor(cardNumber, cvv) {
        this._cardNumber = cardNumber;
        this._cvv = cvv;
    }
    initiatePayment(amount) {
        return false;
    }
}
