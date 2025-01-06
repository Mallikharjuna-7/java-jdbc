package com.xworkz.grocery.repository;

import java.util.List;

import com.xworkz.grocery.dto.GroceryDto;

public interface GroceryRepository {

	boolean save(GroceryDto dto);
	
	List<GroceryDto> read();
	
	String deleteById(int id);
	
	GroceryDto searchById(int id);
	
	String updateById(int id,GroceryDto dto);
	
}
