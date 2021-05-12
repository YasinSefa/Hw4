package gameManager.dataAccess.concretes;

import java.util.List;

import gameManager.dataAccess.abstracts.ProductDao;
import gameManager.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("�r�n eklendi"+ product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n g�ncellendi"+ product.getProductName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n silindi"+ product.getProductName());
		
	}

	@Override
	public Product get(int id) {
		System.out.println("�r�n silindi");
		return null;
	}

	@Override
	public List<Product> getAll() {
		System.out.println("�r�nler getirildi");
		return null;
	}

}
 