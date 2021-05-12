package gameManager.business.concretes;

import gameManager.business.abstracts.CustomerService;
import gameManager.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	@Override
	public void add(Customer customer) {
		if(customer.getFirstName() != null) {
			System.out.println("Devam " + customer.getFirstName());
		}else {
			System.out.println("Kiþi ismi boþ olamaz");		}
		}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi: "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: " + customer.getFirstName());
		
	}

	@Override
	public void getAll(Customer[] customers) {
		for(Customer customer : customers) {
			System.out.println("Müþteriler: " + customer.getFirstName() + "/n");
		}
		
	}
	
}
