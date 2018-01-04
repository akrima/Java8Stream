package com.krima.model;

import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private Integer age;
	private List<String> emails;
	private Gender gender;
	private List<Car> cars;
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, Integer age, List<String> emails, Gender gender, List<Car> cars) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emails = emails;
		this.gender = gender;
		this.cars = cars;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", emails=" + emails
				+ ", gender=" + gender + ", cars=" + cars + "]";
	}
}
