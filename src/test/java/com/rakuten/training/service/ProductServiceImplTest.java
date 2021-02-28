package com.rakuten.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rakuten.training.dal.ProductDAOInMemImpl;
import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductServiceImpl;

class ProductServiceImplTest {

	@Test
	void addProduct_Must_Return_Valid_Id_When_Product_Value_GTEQ_10k() {
		//AAA
		//Arrange
		ProductServiceImpl objUnderTest = new ProductServiceImpl();
		Product arg = new Product("test",10000,1);
		
		ProductDAOInMemImpl doubleforProductDAO = new ProductDAOInMemImpl();
		objUnderTest.setDao(doubleforProductDAO);
		//Act
		int id = objUnderTest.addProduct(arg);
		
		//Assert
		assertTrue(id>0);
		
	}

}
