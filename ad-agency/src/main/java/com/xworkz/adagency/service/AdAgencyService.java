package com.xworkz.adagency.service;

import java.util.List;

import com.xworkz.adagency.dto.AdAgencyDto;

public interface AdAgencyService {

	String saveAndValidate(AdAgencyDto dto);

	List<AdAgencyDto> findAll();

	boolean authenticate(String email, int password);
}
