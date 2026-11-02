package condition;
import java.util.Scanner;

public class Positivenumber {
	
	Scanner scan=new Scanner(System.in);
	
	 void checkno() {
		 System.out.println("positive program");
		 System.out.print("enter the no to check :");
			int num=scan.nextInt();
			if(num<0) {
				 System.out.println("Negative number");
			}
			else if(num>0) {
				 System.out.println("Positive Number");
			}
			else {
				System.out.println("Zero");
			}
		 
	 }

	
	

}
