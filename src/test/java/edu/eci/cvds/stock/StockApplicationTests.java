package edu.eci.cvds.stock;

import static org.junit.jupiter.api.Assertions.*;

import edu.eci.cvds.stock.domain.Product;
import edu.eci.cvds.stock.service.ProductServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StockApplicationTests {
	private ProductServices pServices;

	@BeforeEach
	void setUp(){
		ProductServices pServices = new ProductServices();
	}

	@Test
	void shouldCreateUser() {
		ProductServices pServices = new ProductServices();
		List<Product> products = pServices.getProducts();
		pServices.addProduct("xbox series x", 7, 5000, "asssad");
		assertFalse(products.isEmpty());
	}
}
