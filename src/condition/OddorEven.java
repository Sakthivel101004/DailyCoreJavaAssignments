package condition;

import java.util.Scanner;

public class OddorEven {
	
	Scanner scan=new Scanner(System.in);
	
	void oddeven() {
		 System.out.println("Odd or Even program");
		 System.out.print("enter the no  :");
		 int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
