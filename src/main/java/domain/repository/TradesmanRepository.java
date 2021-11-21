package domain.repository;

import domain.Tradesman;
import domain.TradesmanId;

import java.util.List;

public interface TradesmanRepository {
    void save(Tradesman tradesman);
    Tradesman getTradesmanById(TradesmanId tradesmanId);
    List<Tradesman> getAllTradesman();
}
