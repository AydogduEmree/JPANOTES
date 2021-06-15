package com.company.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Personel {
	
	@Id
	private int personelId;
	private String firstName;
	private String lastName;
	private Date birthOfDate;
	private String personelNumber;

	public Personel() {

	}

	public Personel(int personelId, String firstName, String lastName, Date birthOfDate, String personelNumber) {
		this.personelId = personelId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getPersonelNumber() {
		return personelNumber;
	}

	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
	
}
