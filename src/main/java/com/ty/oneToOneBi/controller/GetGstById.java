package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Company;
import com.ty.oneToOneBi.dto.Gst;

public class GetGstById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst = entityManager.find(Gst.class, 1);
		System.out.println(gst);
	}

}
