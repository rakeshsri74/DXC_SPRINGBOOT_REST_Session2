package com.dxc.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dxc.model.Product;



@Service
public class ProductService implements IProductService {

	private static Map<Integer,Product> pRepo = new HashMap<>();
	
	static {
		Product honey = new Product();
		honey.setId(1);
		honey.setPname("Honey");
		honey.setPrice(123.34);
		honey.setBatchno("aiu123");
		honey.setNoofproduct(2);
		pRepo.put(honey.getId(), honey);
		
		Product almonds = new Product();
		honey.setId(2);
		honey.setPname("Almonds");
		honey.setPrice(1234.34);
		honey.setBatchno("poi876");
		honey.setNoofproduct(20);
		pRepo.put(almonds.getId(),almonds);
	}
	
	public Collection<Product> findAll() {
		return pRepo.values();
	}

	@Override
	public void createProduct(Product product) {
		pRepo.put(product.getId(), product);
		
	}

	@Override
	public void updateProduct(int id, Product product) {
		pRepo.remove(id);
		product.setId(id);
		pRepo.put(id, product);
		
	}

	@Override
	public void deleteProduct(int id) {
		pRepo.remove(id);
		
	}

}
