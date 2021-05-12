package gameManager.business.concretes;

import gameManager.business.abstracts.CustomerService;
import gameManager.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	@Override
	public void add(Customer customer) {
		if(customer.getFirstName() != null) {
			System.out.println("Devam " + customer.getFirstName());
		}else {
			System.out.println("Ki�i ismi bo� olamaz");		}
		}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi: "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: " + customer.getFirstName());
		
	}

	@Override
	public void getAll(Customer[] customers) {
		for(Customer customer : customers) {
			System.out.println("M��teriler: " + customer.getFirstName() + "/n");
		}
		
	}
	
}
