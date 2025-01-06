package com.xworkz.grocery.service;

import java.util.List;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.repository.GroceryRepositoryImplementation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GroceryServiceImplementation implements GroceryService {

	private GroceryRepositoryImplementation repo;
	
	@Override
	public String validateAndSave(GroceryDto dto) {
		if (dto != null) {
			if (repo.save(dto)) {
				return "saved successfully to database";
			}
		}
		return "not saved to database";
	}

	@Override
	public List<GroceryDto> read() {
		
		return repo.read();
	}

	@Override
	public String deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		return "id not matched to delete";
	}

	@Override
	public GroceryDto searchById(int id) {
		
		return repo.searchById(id);
	}

	@Override
	public String updateById(int id, GroceryDto dto) {
		
		return repo.updateById(id, dto);
	}

}
