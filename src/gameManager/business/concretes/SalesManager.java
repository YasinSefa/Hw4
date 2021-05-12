package gameManager.business.concretes;

import gameManager.business.abstracts.SalesService;
import gameManager.entities.concretes.*;

public class SalesManager implements SalesService {
	    public void sellWithCampaign(Customer customer, Product product, Campaign campaign, Order order) {
	        System.out.println("Sipariþ gerçekleþtirildi. " + customer.getFirstName() + " isimli müþteriye, " + product.getProductName() + " adlý ürün, " + campaign.getCampaignName() + " kampanyasý ile satýldý.");
	    }

	    public void sellWithoutCampaign(Customer customer, Product product, Order order) {
	        System.out.println("Sipariþ gerçekleþtirildi. " + customer.getFirstName() + " isimli müþteriye, " + product.getProductName() + " adlý ürün kampanyasýz satýldý.");
	    }
}
