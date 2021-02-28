package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Product;

public interface ProductService {

	int addProduct(Product toBeAdded);

	void removeExisting(int id);

	Product findbyId(int id);

	List<Product> findAll();

}