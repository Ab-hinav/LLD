"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PaymentServiceImpl = void 0;
var Cash_1 = require("../paymentMethods/Cash");
var CreditCard_1 = require("../paymentMethods/CreditCard");
var PaymentServiceImpl = /** @class */ (function () {
    function PaymentServiceImpl() {
    }
    PaymentServiceImpl.prototype.acceptCash = function (amount) {
        var cash = new Cash_1.Cash();
        cash.initiatePayment(amount);
    };
    PaymentServiceImpl.prototype.acceptCreditCard = function (cardNumber, cvv, amount) {
        var crediCard = new CreditCard_1.CreditCard(cardNumber, cvv);
        crediCard.initiatePayment(amount);
    };
    return PaymentServiceImpl;
}());
exports.PaymentServiceImpl = PaymentServiceImpl;
