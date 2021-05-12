package gameManager.entities.concretes;

import gameManager.entities.abstracts.Entity;

public class Customer implements Entity {
	private int nationalityId;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int nationalityId, String firstName, String lastName, int yearOfBirth) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	public int getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
}
