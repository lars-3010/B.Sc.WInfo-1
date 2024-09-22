package model;

import java.time.LocalDate;

public class Person implements Ageable {

	private String name;
	private int yearOfBirth;

	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public int getAge() {
		return LocalDate.now().getYear() - yearOfBirth;
	}

	public String getName() {
		return this.name;
	}

	public int getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String toString() {
		return "Name ist: " + name + ", Alter: " + getAge();
	}

}
