package condition;
import java.util.Scanner;

public class Largestoftwonumbers {
	
	Scanner scan =new Scanner(System.in);
	
	void largest() {
		System.out.println("Largestoftwonumbers program");
		
		System.out.println("Enter the first no: ");
		int num1=scan.nextInt();
		
		System.out.println("enter the second no: ");
		int num2=scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+" is largest no");
		}
		else {
			System.out.println(num2+" is largest no");
			
		}
	}
	

}
