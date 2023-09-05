"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Cash = void 0;
var Cash = /** @class */ (function () {
    function Cash() {
    }
    Cash.prototype.initiatePayment = function (amount) {
        console.log("Cash payment initiated of amount :" + amount);
        return true;
    };
    return Cash;
}());
exports.Cash = Cash;
