package gameManager.business.concretes;

import gameManager.business.abstracts.SalesService;
import gameManager.entities.concretes.*;

public class SalesManager implements SalesService {
	    public void sellWithCampaign(Customer customer, Product product, Campaign campaign, Order order) {
	        System.out.println("Sipari� ger�ekle�tirildi. " + customer.getFirstName() + " isimli m��teriye, " + product.getProductName() + " adl� �r�n, " + campaign.getCampaignName() + " kampanyas� ile sat�ld�.");
	    }

	    public void sellWithoutCampaign(Customer customer, Product product, Order order) {
	        System.out.println("Sipari� ger�ekle�tirildi. " + customer.getFirstName() + " isimli m��teriye, " + product.getProductName() + " adl� �r�n kampanyas�z sat�ld�.");
	    }
}
