package gameManager.business.abstracts;

import gameManager.entities.concretes.Order;

public interface OrderService {
    void add(Order order);
    void update(Order order);
    void delete(Order order);
    void getAll();
}
