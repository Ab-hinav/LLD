"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DisplayBoard = void 0;
var DisplayBoard = /** @class */ (function () {
    function DisplayBoard() {
        this.freeParkingSpots = new Map();
    }
    DisplayBoard.getInstance = function () {
        if (!DisplayBoard.instance) {
            this.instance = new DisplayBoard();
        }
        return DisplayBoard.instance;
    };
    DisplayBoard.prototype.getFreeParkingSpots = function () {
        return this.freeParkingSpots;
    };
    return DisplayBoard;
}());
exports.DisplayBoard = DisplayBoard;
