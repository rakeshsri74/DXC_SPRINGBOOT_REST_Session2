package com.dxc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Product;
import com.dxc.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService service;
	
	@GetMapping("/products")
	public Collection<Product> getProduct(){
		Collection<Product> products = service.findAll();
		return products;
	}
	
	@PostMapping("/products")
	public void createProduct(@RequestBody Product product) {
		service.createProduct(product);
	}
	
	@PutMapping("/products/{id}")
	public void updateProduct(@PathVariable("id") int id,@RequestBody Product product) {
		service.updateProduct(id, product);
		
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		service.deleteProduct(id);
		
	}
	
}
