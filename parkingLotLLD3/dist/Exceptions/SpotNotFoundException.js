export class SpotNotFoundException extends Error {
    constructor() {
        super("Spot Not Found");
    }
}
