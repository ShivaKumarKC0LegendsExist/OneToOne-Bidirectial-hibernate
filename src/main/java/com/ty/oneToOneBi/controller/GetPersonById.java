package com.ty.oneToOneBi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.oneToOneBi.dto.Pan;
import com.ty.oneToOneBi.dto.Person;

public class GetPersonById {

	public static void main(String[] args) throws InterruptedException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 2);
		System.out.println("Person "+person.getName());
		Thread.sleep(2000);
		System.out.println("--------------------------------");
		System.out.println("Pan "+person.getPan());
		
	}

}
