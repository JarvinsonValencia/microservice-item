package com.springboot.app.item.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	private Product product;
	private Integer quantity;
	
	public Double getTotal() {
		return product.getPrice() * quantity.doubleValue();
	}

}
