package com.ty.oneToOneBi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	@OneToOne(mappedBy = "company")
	private Gst gst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Gst getGst() {
		return gst;
	}

	public void setGst(Gst gst) {
		this.gst = gst;
	}

	@Override
	public String toString() {
		return "Company\nid=" + id + "\nname=" + name + "\nphone=" + phone ;
	}

}
