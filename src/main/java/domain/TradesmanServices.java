package domain;

import domain.repository.TradesmanRepository;

import java.util.List;

public class TradesmanServices {
    private final TradesmanRepository tradesmanRepository;

    public TradesmanServices(TradesmanRepository tradesmanRepository) {
        this.tradesmanRepository = tradesmanRepository;
    }

    public void addTradesman(Tradesman tradesman) {
        this.tradesmanRepository.save(tradesman);
    }

    public void changePassword(TradesmanId tradesmanId, String newPassword) {
        var tradesman = this.tradesmanRepository.getTradesmanById(tradesmanId);
        tradesman.getTradesmanInformation().setPassword(newPassword);
        this.tradesmanRepository.save(tradesman);
    }
    public void changeCallNumber(TradesmanId tradesmanId, String newCallNumber) {
        var tradesman = this.tradesmanRepository.getTradesmanById(tradesmanId);
        tradesman.getTradesmanInformation().setCallNumber(newCallNumber);
        this.tradesmanRepository.save(tradesman);
    }
    public void changeAddress(TradesmanId tradesmanId, Address newAddress) {
        var tradesman = this.tradesmanRepository.getTradesmanById(tradesmanId);
        tradesman.getTradesmanInformation().setAddress(newAddress);
        this.tradesmanRepository.save(tradesman);
    }

    public List<Tradesman> all() {
        return this.tradesmanRepository.getAllTradesman();
    }
}
