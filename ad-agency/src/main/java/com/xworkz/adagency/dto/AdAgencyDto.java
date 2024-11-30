package com.xworkz.adagency.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class AdAgencyDto {

	private int id;
	private String personName;
	private String companyName;
	private String productName;
	private long contactNumber;
	private String email;
	private int password;
}
