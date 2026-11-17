package functionalInterface;

public class Main {

	public static void main(String[] args) {
		
		 Student__1  dis=(String name, int age, String dept) -> {
			 
			 System.out.println("Student name: "+name);
			 System.out.println("Age: "+age);
			 System.out.println("Department: "+dept);
		 };
		 
		 dis.display("sakthivel", 21, "CSE");
		 
		 
		 
		 Calculator__2 cal=(int a,int b)->{
			 System.out.println("Addition: "+ (a+b));
			 System.out.println("Subtraction: "+ (a-b));
			 System.out.println("Multiplication: "+ a*b);
			 System.out.println("Division: "+ a/b);
		 };
		 
		 cal.calculator(20, 10);

	}

}
