package com.xworkz.grocery.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GroceryDto {

	private int id;
	private String grocery_name;
	private String category;
	private int quantity;
	private int price;

}
