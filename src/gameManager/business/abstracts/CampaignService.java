package gameManager.business.abstracts;

import gameManager.entities.concretes.Campaign;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    void printAllItems();
}
