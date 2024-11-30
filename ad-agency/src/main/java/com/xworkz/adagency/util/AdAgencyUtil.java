package com.xworkz.adagency.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.adagency.dto.AdAgencyDto;
import com.xworkz.adagency.entity.AdAgencyEntity;

public class AdAgencyUtil {

	private AdAgencyUtil() {

	}

	public static EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();
	}

	public static AdAgencyDto mapEntityToDto(AdAgencyEntity enity) {

		AdAgencyDto dto = new AdAgencyDto();

		dto.setId(enity.getId());
		dto.setPersonName(enity.getPersonName());
		dto.setCompanyName(enity.getCompanyName());
		dto.setProductName(enity.getProductName());
		dto.setContactNumber(enity.getContactNumber());
		dto.setEmail(enity.getEmail());
		dto.setPassword(enity.getPassword());
		return dto;
	}

	public static AdAgencyEntity mapDtoToEntity(AdAgencyDto dto) {

		AdAgencyEntity entity = new AdAgencyEntity();

		entity.setPersonName(dto.getPersonName());
		entity.setCompanyName(dto.getCompanyName());
		entity.setProductName(dto.getProductName());
		entity.setContactNumber(dto.getContactNumber());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		return entity;
	}

}
