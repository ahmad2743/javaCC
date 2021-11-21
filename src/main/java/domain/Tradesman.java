package domain;

import domain.paymentServices.CreditCard;
import java.util.List;

import java.util.Objects;

public class Tradesman {
    private final TradesmanId tradesmanId;
    private final String firstName;
    private final String lastName;
    private TradesmanInformation tradesmanInformation;
    private List<CreditCard> creditCards;


    private Tradesman(TradesmanId tradesmanId, String firstName, String lastName, TradesmanInformation tradesmanInformation) {
        this.tradesmanId = Objects.requireNonNull(tradesmanId);
        this.firstName = Objects.requireNonNull(firstName);
        this.lastName = Objects.requireNonNull(lastName);
        this.tradesmanInformation = tradesmanInformation;
    }

    public static Tradesman of(TradesmanId tradesmanID, String firstName, String lastName, TradesmanInformation tradesmanInformation){
        return new Tradesman(tradesmanID, firstName, lastName, tradesmanInformation);
    }

    public TradesmanInformation getTradesmanInformation() {
        return this.tradesmanInformation;
    }
    public TradesmanId getTradesmanId() {
        return tradesmanId;
    }
    public List<CreditCard> getCreditCards(){
        return creditCards;
    }
    public void setCreditCard(CreditCard card){
        this.creditCards.add(card);
    }

}
