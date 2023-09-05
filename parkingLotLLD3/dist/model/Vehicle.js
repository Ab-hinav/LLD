import { BaseEntity } from "./BaseEntity";
class Vehicle extends BaseEntity {
    constructor(name) {
        super();
        this.name = '';
        this.regNumber = '';
    }
}
