package domain.paymentServices;

import domain.Tradesman;

public class PaymentService {
    public void makePayment(CreditCard card){
            if (card.isValid())
                System.out.println("successful payment");
            else
                System.out.println("cedit card not valid");
        return;
    }
}
