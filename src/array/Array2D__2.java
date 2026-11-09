package array;
import java.util.Scanner;




/*Question 2 – 2D Array: Student Performance
A college has 3 classes, and each class contains 4 students.
Write a Java program to:
Store student marks using a 2D array.
Display marks class-wise.
Calculate each class's total marks.
Find the highest mark in each class.
Find the overall topper.*/

public class Array2D__2 {
	
	Scanner scan=new Scanner(System.in);
	
	void display() {
	//	int mark[][]=new int[3][4];
		
		int mark[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(mark[0][1]);
		System.out.println(mark[0].length);
		
	}
	
	
	public static void main(String args[]) {
		Array2D__2 two=new Array2D__2();
		two.display();
		
		
	}
	

}


