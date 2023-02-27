package com.springboot.app.item.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private Long id;
	private String name;
	private Double price;
	private Date createAt;
	private Integer port;
	
}
