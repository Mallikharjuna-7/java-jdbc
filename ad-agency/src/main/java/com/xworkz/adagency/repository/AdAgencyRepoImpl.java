package com.xworkz.adagency.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xworkz.adagency.entity.AdAgencyEntity;
import com.xworkz.adagency.util.AdAgencyUtil;

public class AdAgencyRepoImpl implements AdAgencyRepo {

	@Override
	public void save(AdAgencyEntity enity) {

		EntityManager manager = AdAgencyUtil.getManager();

		manager.getTransaction().begin();
		manager.persist(enity);
		manager.getTransaction().commit();
		manager.clear();
	}

	@Override
	public List<AdAgencyEntity> findAll() {

		EntityManager manager = AdAgencyUtil.getManager();

		TypedQuery<AdAgencyEntity> query = manager.createNamedQuery("read", AdAgencyEntity.class);

		return query.getResultList();
	}

	@Override
	public AdAgencyEntity authenticateUser(String email, int password) {
		EntityManager manager = AdAgencyUtil.getManager();
		TypedQuery<AdAgencyEntity> query = manager.createNamedQuery("authentication", AdAgencyEntity.class);
		query.setParameter("email", email);
		query.setParameter("password", password);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
