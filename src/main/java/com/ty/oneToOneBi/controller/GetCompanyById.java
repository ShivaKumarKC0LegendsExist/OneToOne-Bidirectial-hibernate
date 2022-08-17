package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Company;

public class GetCompanyById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company = entityManager.find(Company.class, 1);
//		System.out.println(company);
		System.out.println(company.getGst());
	}

}
