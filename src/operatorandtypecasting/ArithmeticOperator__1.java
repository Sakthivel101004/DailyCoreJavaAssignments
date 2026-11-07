package operatorandtypecasting;

/**
 Arithmetic Operator:
 
 Write a Java program to find the sum, difference, product, and division of two numbers.
 */
 

public class ArithmeticOperator__1 {
	
	

	
	void sum(int a,int b) {
		System.out.println("sum of two no: " + (a+b));
	}
	
	void difference(int a,int b) {
		System.out.println("difference of two no: "+ Math.abs(a-b));
	}
	void prodiuct(double a,double b) {
		System.out.println("product of two no: "+ a*b);
	}
	void divison(int a,int b) {
		System.out.println("divison of two no: "+(  (double) a/b));
	}
	

}
