import { v4 as uuidv4 } from 'uuid';
export class BaseEntity {
    constructor() {
        this._id = uuidv4();
    }
}
