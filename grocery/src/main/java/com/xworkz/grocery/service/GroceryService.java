package com.xworkz.grocery.service;

import java.util.List;

import com.xworkz.grocery.dto.GroceryDto;

public interface GroceryService {

	String validateAndSave(GroceryDto dto);
	
	List<GroceryDto> read();
	
	String deleteById(int id);
	
	GroceryDto searchById(int id);
	
	String updateById(int id,GroceryDto dto);
}
