package gameManager.business.abstracts;

import gameManager.entities.concretes.Customer;

public interface CustomerService {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    void getAll(Customer[] customers);
}
