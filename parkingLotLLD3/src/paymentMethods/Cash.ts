import { PaymentMethods } from "./PaymentMethods";





export class Cash implements PaymentMethods {


    initiatePayment(amount: number): boolean {
        
        console.log("Cash payment initiated of amount :"+amount);
        return true;
    
    }

}