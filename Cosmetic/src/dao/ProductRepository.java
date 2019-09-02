package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	// cartlist를 만들기 위한 코드만 남겨두기
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getcosmeticById(String c_id) {
		Product cosmeticById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product cosmetic = listOfProducts.get(i);
			if (cosmetic != null && cosmetic.getC_id() != null && cosmetic.getC_id().equals(cosmeticById)) {
				cosmeticById = cosmetic;
				break;
			}
		}
		return cosmeticById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
