package infrastructure;

import domain.Tradesman;
import domain.TradesmanId;
import domain.repository.TradesmanRepository;

import java.util.List;

public class JdbcTradesmanRepository implements TradesmanRepository {
    @Override
    public void save(Tradesman tradesman) {

    }

    @Override
    public Tradesman getTradesmanById(TradesmanId tradesmanId) {
        return null;
    }

    @Override
    public List<Tradesman> getAllTradesman() {
        return null;
    }
}
