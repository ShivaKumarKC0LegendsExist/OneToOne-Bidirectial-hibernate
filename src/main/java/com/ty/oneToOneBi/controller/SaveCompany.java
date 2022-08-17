package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Company;
import com.ty.oneToOneBi.dto.Gst;

public class SaveCompany {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		
		Company company=new Company();
		company.setName("ACCENTURE");
		company.setPhone(987654321);
		
		Gst gst = new Gst();
		gst.setGstNumber(809873123456l);
		gst.setStatus("Successful");
		
		gst.setCompany(company);
		
		transaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		transaction.commit();
		
	}

}
