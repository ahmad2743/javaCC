package infrastructure;

import domain.Tradesman;
import domain.TradesmanId;
import domain.repository.TradesmanRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InMemoryTradesmanRepository implements TradesmanRepository {
    private final AtomicInteger counter = new AtomicInteger(0);
    private final Map<TradesmanId, Tradesman> data = new ConcurrentHashMap<>();
    @Override
    public void save(Tradesman tradesman) {
        data.put(tradesman.getTradesmanId(), tradesman);
    }

    @Override
    public Tradesman getTradesmanById(TradesmanId tradesmanId) {
        final Tradesman tradesman = data.get(tradesmanId);
        if (tradesman == null) {
            throw new RuntimeException("No tradesman for this ID " + tradesmanId.getValue());
        }
        return tradesman;
    }

    @Override
    public List<Tradesman> getAllTradesman() {
        return new ArrayList<>(data.values());
    }
}
