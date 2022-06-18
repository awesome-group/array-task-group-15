package main;

public class User implements UserInterface {

	private int age;
	String name;
	String surName;
	String fatherName;
	String email;
	String phoneNumber;

	public void setAge(int age) {
		if (age < 10) {
			System.out.println("Yanlis Deyer");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "age=" + age + ", name=" + name + ", surName=" + surName + ", fatherName=" + fatherName + ", email="
				+ email + ", phoneNumber=" + phoneNumber;
	}

	@Override
	public String getLastName() {
		return this.name + " " + this.surName;
	}

}
