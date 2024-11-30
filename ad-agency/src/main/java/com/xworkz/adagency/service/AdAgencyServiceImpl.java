package com.xworkz.adagency.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.adagency.dto.AdAgencyDto;
import com.xworkz.adagency.entity.AdAgencyEntity;
import com.xworkz.adagency.repository.AdAgencyRepo;
import com.xworkz.adagency.util.AdAgencyUtil;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdAgencyServiceImpl implements AdAgencyService {

	private AdAgencyRepo repo;

	@Override
	public String saveAndValidate(AdAgencyDto dto) {

		AdAgencyEntity entity = AdAgencyUtil.mapDtoToEntity(dto);

		repo.save(entity);

		return "successfully saved in database";
	}

	@Override
	public List<AdAgencyDto> findAll() {

		List<AdAgencyEntity> entity = repo.findAll();

		return entity.stream().map(AdAgencyUtil::mapEntityToDto).collect(Collectors.toList());
	}

	@Override
	public boolean authenticate(String email, int password) {
		AdAgencyEntity entity = repo.authenticateUser(email, password);
        return entity != null;
	}

}
