package domain;
import java.util.Objects;
public class TradesmanInformation {
    private final String email;
    private String password;
    private String callNumber;
    private Address address;

    public TradesmanInformation(String email, String password, String callNumber, Address address) {
        this.email = Objects.requireNonNull(email);
        this.password = Objects.requireNonNull(password);
        this.callNumber = Objects.requireNonNull(callNumber);
        this.address = Objects.requireNonNull(address);
    }

    public void setPassword(String password) {
        this.password = Objects.requireNonNull(password);
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = Objects.requireNonNull(callNumber);
    }

    public void setAddress(Address address) {
        this.address = Objects.requireNonNull(address);
    }

    public String getEmail() {
        return email;
    }
}
