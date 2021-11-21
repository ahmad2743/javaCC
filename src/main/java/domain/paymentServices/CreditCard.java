package domain.paymentServices;

public class CreditCard {
    private final String ownerCardName;
    private final String cardNumber;
    private final String validityDate;
    private final int cvvCode;

    private CreditCard(String ownerCardName, String cardNumber, String validityDate, int cvvCode) {
        this.ownerCardName = ownerCardName;
        this.cardNumber = cardNumber;
        this.validityDate = validityDate;
        this.cvvCode = cvvCode;
    }
    public static CreditCard createCreditCardCredential(String ownerCardName, String cardNumber, String validityDate, int cvvCode){
        return new CreditCard(ownerCardName, cardNumber, validityDate, cvvCode);
    }

    public boolean isValid(){
        if (true)
            return true;
        else
            return false;
    }

}

