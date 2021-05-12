package gameManager.business.concretes;

import java.util.List;

import gameManager.business.abstracts.ProductService;
import gameManager.entities.concretes.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoriye ürün eklenemez");
			return;
		}
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
