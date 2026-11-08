package oops;

public class Developer__2 extends Employee__2 {
	
	String programming_language;
	
	Developer__2 (String language,String name,int rollno,double salary){
		super(name,rollno,salary);
		
		this.programming_language=language;
	}
	
	void display() {
		super.display();
		System.out.println("programming_language: "+programming_language);
	}

}
