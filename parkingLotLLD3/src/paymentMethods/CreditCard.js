"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreditCard = void 0;
var CreditCard = /** @class */ (function () {
    function CreditCard(cardNumber, cvv) {
        this._cardNumber = cardNumber;
        this._cvv = cvv;
    }
    CreditCard.prototype.initiatePayment = function (amount) {
        return false;
    };
    return CreditCard;
}());
exports.CreditCard = CreditCard;
