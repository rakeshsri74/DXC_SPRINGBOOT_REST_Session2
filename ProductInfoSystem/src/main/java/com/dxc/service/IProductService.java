package com.dxc.service;

import java.util.Collection;

import com.dxc.model.Product;

public interface IProductService {
	public void createProduct(Product product);
	public void updateProduct(int id,Product product);
	public void deleteProduct(int id);
	Collection<Product> findAll();
	
}
