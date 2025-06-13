package com.micro.Order_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	ProductServiceClient productServiceClient;
	
	@GetMapping("/orders")
	public String Orders() {
		return "Order service is ready to communicate with Psoduct service";
	}
	
	@GetMapping("/order/{productId}")
	public String createOrder(@PathVariable String productId) {
		Product product =  productServiceClient.getProductById(productId);
		return " Order is placed  with name : "+product.getName()+" cost you "+product.getPrice();
	}
}
