package oops;


/*
 * 1. Class & Object – Student Management

A college needs to store student information such as name, rollNo, and mark. Create a Student class with these properties and a method to display the student details. Create two Student objects with different values and display their details.

Question: How will you design the class and create the objects?
 * */

public class Student__1 {
	
	String name;
	int rollno;
	double mark;
	
	void dispaly(String name,int rollno,double mark) {
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
		
		
		System.out.println("name: \t"+this.name+" \nroll no: "+this.rollno+" \nmark: "+this.mark);
		
	}

}
