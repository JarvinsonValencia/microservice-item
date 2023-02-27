package com.springboot.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.app.item.models.Product;

@FeignClient(name = "servicio-producto")
public interface ProductClientRest {
	
	@GetMapping("/list")
	public List<Product> findAll();
	
	@GetMapping("/list/{id}")
	public Product findById(@PathVariable Long id);
}
