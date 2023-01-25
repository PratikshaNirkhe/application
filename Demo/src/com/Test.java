package com;

public class Test {

	public static void main(String[] args) {

		System.out.println("Feature Create file");

		Student s = new Student();
		s.setId(101);
		s.setName("Rani");
		s.setAddress("Pune");

		System.out.println("Check Student Deatils:" + s);
	}
}
