"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Wash = void 0;
var SpotDecorator_1 = require("./SpotDecorator");
var Wash = /** @class */ (function (_super) {
    __extends(Wash, _super);
    function Wash(parkingSpot) {
        return _super.call(this, parkingSpot) || this;
    }
    Wash.prototype.cost = function (parkingHours) {
        return this.parkingSpot.cost(parkingHours) + 50;
    };
    return Wash;
}(SpotDecorator_1.SpotDecorator));
exports.Wash = Wash;
