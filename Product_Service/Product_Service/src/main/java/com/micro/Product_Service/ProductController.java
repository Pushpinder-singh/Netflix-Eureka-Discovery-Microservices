package com.micro.Product_Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) {
		return new Product(id, "Product One", 101.99); // creating sample product
		//return getProduct(id);	// get product from database in real application
	}
}
