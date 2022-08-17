package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Pan;
import com.ty.oneToOneBi.dto.Person;

public class TestPersonPan {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Divya");
		person.setAge(24);
		
		Pan pan = new Pan();
		pan.setPanNumber("RTYDS123");
		pan.setFatherName("Kaju");
		
		
		pan.setPerson(person);
		
		transaction.begin();
		
		entityManager.persist(person);
		entityManager.persist(pan);
		
		transaction.commit();
	}

}
