package com.xworkz.adagency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "ad_agency_details")
@NamedQuery(name = "read", query = "Select e from AdAgencyEntity e")

@NamedQuery(name = "authentication", query = "SELECT e FROM AdAgencyEntity e WHERE e.email = :email AND e.password = :password")
public class AdAgencyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ad_personName")
	private String personName;

	@Column(name = "ad_companyName")
	private String companyName;

	@Column(name = "ad_productName")
	private String productName;

	@Column(name = "ad_contactNumber")
	private long contactNumber;

	@Column(name = "ad_email")
	private String email;

	@Column(name = "ad_password")
	private int password;

}
