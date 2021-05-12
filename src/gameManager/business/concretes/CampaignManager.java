package gameManager.business.concretes;

import gameManager.business.abstracts.CampaignService;
import gameManager.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya oluþturuldu:" + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi:" + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi:" + campaign.getCampaignName());
		
	}

	@Override
	public void printAllItems() {
		System.out.println("Tüm kampanyalar getirildi:");
		
	}
	
}
