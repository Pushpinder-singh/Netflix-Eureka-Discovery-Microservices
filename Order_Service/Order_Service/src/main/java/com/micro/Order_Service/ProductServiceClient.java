package com.micro.Order_Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Product-Service")
public interface ProductServiceClient {
		@GetMapping("/products/{id}")
    	Product getProductById(@PathVariable String id);

}
