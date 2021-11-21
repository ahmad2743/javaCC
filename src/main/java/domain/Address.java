package domain;
import java.util.Objects;
public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String zipCode;
    private String additionalAddress;

    private Address(int streetNumber, String streetName, String city, String zipCode, String additionalAddress) {
        this.streetNumber = Objects.requireNonNull(streetNumber);
        this.streetName = Objects.requireNonNull(streetName);
        this.city = Objects.requireNonNull(city);
        this.zipCode = Objects.requireNonNull(zipCode);
        this.additionalAddress = additionalAddress;
    }
    public static Address of(int streetNumber, String streetName, String city, String zipCode, String additionalAddress){
        return new Address(streetNumber, streetName, city, zipCode, additionalAddress);
    }
}
