package domain;
import java.util.UUID;
public class TradesmanId {
    private final String value;

    private TradesmanId(String value) {
        this.value = value;
    }

    public static TradesmanId fromUUID(UUID uuid) {
        return new TradesmanId(uuid.toString());
    }

    public static TradesmanId of(String value) {
        return new TradesmanId(value);
    }

    public String getValue() {
        return value;
    }
}
