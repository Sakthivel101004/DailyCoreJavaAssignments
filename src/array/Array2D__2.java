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
		//int arr= {{1,2,3},{4,6,7}};
	//	int mark[][]=new int[3][4];
		System.out.println("enter the no of class:");
		int row=scan.nextInt();
		System.out.println("enter the no Students for each class :");
		int col=scan.nextInt();
		int mark[][]= new int[row][col];
		System.out.println(mark[0].length);
		
		for(int i=0;i<mark.length;i++) {     //Store student marks using a 2D array.
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter the mark for class"+ (i+1)+"  student"+(j+1));
				mark[i][j]=scan.nextInt();
				
			}
			
		}
		
		for(int i=0;i<mark.length;i++) {      //Display marks class-wise.
			for(int j=0;j<mark[i].length;j++) {
				
				System.out.println(" marks for class "+ (i+1)+" student "+(j+1 )+ " "+ mark[i][j]);
				
			}
			
		}
		
		
		int top_mark=mark[0][0];
		for(int i=0;i<mark.length;i++) {      //Calculate each class's total marks.
			int total=0;
			int high=mark[i][0];     //Find the highest mark in each class.
			int low=mark[i][0];
			
			
			for(int j=0;j<mark[i].length;j++) {
				if(high<mark[i][j]) {
					high=mark[i][j];
				}
				if(low>mark[i][j]) {
					low=mark[i][j];
				}
				
		        if(top_mark<mark[i][j]) {
		        	top_mark=mark[i][j];
		        }
				total+=mark[i][j];
			}
			System.out.println("total mark for class "+ (i+1)+" " +total);
			
			System.out.println("highest mark for class "+(i+1)+" "+ high);
			System.out.println("lowest  mark for class "+(i+1)+ " "+low);
		}
		System.out.println("top mark is "+top_mark);
	}
	
	
	
	
	
	
	
	
	
	
	

}


