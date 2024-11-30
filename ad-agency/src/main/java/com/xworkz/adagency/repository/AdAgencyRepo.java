package com.xworkz.adagency.repository;

import java.util.List;

import com.xworkz.adagency.entity.AdAgencyEntity;


public interface AdAgencyRepo {

	void save(AdAgencyEntity enity);

	List<AdAgencyEntity> findAll();
	
	AdAgencyEntity authenticateUser(String email, int password);
}
