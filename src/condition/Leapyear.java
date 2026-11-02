package condition;

import java.util.Scanner;

public class Leapyear {
	Scanner scan =new Scanner(System.in);
	
	
	void year() {
		
		System.out.println("leap year Program");
		System.out.println("enter the year");
		int year=scan.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
