package gameManager.business.abstracts;

import gameManager.entities.concretes.*;

public interface SalesService {
    void sellWithCampaign(Customer customer, Product product, Campaign campaign, Order order);
    void sellWithoutCampaign(Customer customer, Product product, Order order);
}
