package com.practice.OOP;


/*
 * Hierarchy: ==> means extends
 * Object ==> Person ==> Student implements Interfacce2, Employee
 * Student ==> Music Student implements Interface1
 * Employee ==> Manager implements Interface2
 */
public class PersonApp {

	public static void main(String[] args) {
		Employee e = new Employee(101010, 200.00f, "sales");
		
		Employee e2 = new Employee("John Doe", "John's address", "email@email.com", "121212", 121221, 200.00f, "sales");

		e.setName("John");
		e.setEmail("email@email.com");
		e.setAddress("New York");
		e.setPhone("1212121212");
		
		System.out.println(e);
		System.out.println(e2);
		
		Person p = new Person();
		p.phone = "1212";
		
		Manager m = new Manager();
		System.out.println("m is a manager: " + ( m instanceof Manager));
		
		Manager m1 = new Manager();
		System.out.println("m1 is Employee: " + (m1 instanceof Employee));
		
		Manager m2 = new Manager();
		System.out.println("m2 is Person: " + (m2 instanceof Person));
		
		Manager m3 = new Manager();
		System.out.println("m3 is Interface2: " + (m3 instanceof MyInterface2));
		
		Manager m4 = new Manager();
		System.out.println("m4 is Interface1: " + (m4 instanceof MyInterface1));
		
		Student s1 = new Student();
		System.out.println("s1 is Person: " + (s1 instanceof Person));
		
		Student s2 = new Student();
		System.out.println("s2 is Music Student " + (s2 instanceof MusicStudent));
		
		// Example of having both operands of instanceof on different branch.
		// Student s3 = new Student();
		//System.out.println("s3 is Employee: " + (s3 instanceof Employee));
		
		Student s4 = new Student();
		System.out.println("s4 is Object: " + (s4 instanceof Object));
		
		Student s5 = new Student();
		System.out.println("s5 is Interface1: " + (s5 instanceof MyInterface1));
		
		MyInterface1 m6 = new MusicStudent();
		System.out.println("m6 is MyInterface1: " + (m6 instanceof MyInterface1));

		Student m5 = new MusicStudent();
		System.out.println("m5 is Music Student: " + (m5 instanceof MusicStudent));
		
		Student m7 = new MusicStudent();
		System.out.println("m7 is Student: " + (m7 instanceof Student));
		
		Person p1 = new Person();
		System.out.println("p1 is Student: " + (p1 instanceof Student));
	}

}
