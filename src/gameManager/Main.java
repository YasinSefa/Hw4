package gameManager;

import gameManager.business.concretes.CampaignManager;
import gameManager.business.concretes.CustomerManager;
import gameManager.business.concretes.OrderManager;
import gameManager.business.concretes.ProductManager;
import gameManager.business.concretes.SalesManager;
import gameManager.entities.concretes.Campaign;
import gameManager.entities.concretes.Customer;
import gameManager.entities.concretes.Order;
import gameManager.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product= new Product(1,1,"Bilgisayar",5000,6);
		Campaign campaign = new Campaign(1,"Yaz indirimi", 50);
		Order order = new Order(1,1,1,1,1);
		Customer customer = new Customer(152646,"Yasin Sefa","Aksoy",2002);
		
		    CustomerManager customerManager = new CustomerManager();
	        customerManager.add(customer);
	        customerManager.delete(customer);
	        customerManager.update(customer);

	        ProductManager productManager = new ProductManager();
	        productManager.add(product);
	        productManager.delete(product);
	        productManager.update(product);

	        CampaignManager campaignManager = new CampaignManager();
	        campaignManager.add(campaign);
	        campaignManager.delete(campaign);
	        campaignManager.update(campaign);

	        OrderManager orderManager = new OrderManager();
	        orderManager.add(order);
	        orderManager.delete(order);
	        orderManager.update(order);
	        
	        SalesManager salesManager = new SalesManager();
	        salesManager.sellWithCampaign(customer,product,campaign,order);
	        salesManager.sellWithoutCampaign(customer,product,order);


	}

}
