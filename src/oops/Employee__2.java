package oops;

/*
 * 2. Inheritance – Employee Management
A company has a general Employee class containing name, id, and salary. A Developer class should inherit these properties and additionally contain programmingLanguage.

Question: Create the parent and child classes using inheritance and display the complete developer information.

*/

public class Employee__2 {
	String name;
	int rollno;
	double salary;
	
	Employee__2(String name,int rollno,double salary){
		this.name=name;
		this.rollno=rollno;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("name: "+name+ "\nrollno: "+rollno+"\nsalary"+salary);
	}
	
	


}
