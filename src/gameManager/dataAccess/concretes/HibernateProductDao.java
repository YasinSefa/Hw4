package gameManager.dataAccess.concretes;

import java.util.List;

import gameManager.dataAccess.abstracts.ProductDao;
import gameManager.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Ürün eklendi"+ product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün güncellendi"+ product.getProductName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün silindi"+ product.getProductName());
		
	}

	@Override
	public Product get(int id) {
		System.out.println("Ürün silindi");
		return null;
	}

	@Override
	public List<Product> getAll() {
		System.out.println("Ürünler getirildi");
		return null;
	}

}
 