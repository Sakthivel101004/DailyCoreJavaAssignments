package array;

import java.util.Scanner;
/*
Question 3 – 3D Array: College Management

A college has 2 departments, each department has 2 classes, and each class has 3 students.
Write a Java program to:

Store student marks using a 3D array.
Display department-wise and class-wise marks.
Calculate each class's average.
Find the highest mark in each department.
Find the overall highest mark.
 */
public class Array3D__3 {
	
	Scanner scan=new Scanner(System.in);

	
	
	
	
	public void display() {
		
		 int mark[][][]= {
				   {{1,2,3},{4,5}},
				   {{6,7,8}}
		   };
		System.out.println(mark[0][0][0]);
		
		System.out.println("Enter the no of dept : ");
		int dept=scan.nextInt();
		System.out.println("Enter the no  class   : ");
		int row=scan.nextInt();
		System.out.println("Enter the no of students : ");
		int col=scan.nextInt();
		
		int arr[][][]=new int[dept][row][col];
		
		for(int i=0;i<arr.length;i++) {       //Store student marks using a 3D array.
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the mark for dept "+(i+1)+" "+ "class " +(j+1)+ "student "+" "+(k+1));
					arr[i][j][k]=scan.nextInt();
					
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {     //  Display department-wise and class-wise marks.
			for(int j=0;j<arr[i].length;j++) {
				
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the mark for dept "+(i+1)+" "+ "class " +(j+1)+ " student "+(k+1)+" :"+arr[i][j][k]);
					
					
				}
			}
		}
		
/*Calculate each class's average.
Find the highest mark in each department.
Find the overall highest mark.*/
		int topmark=arr[0][0][0];
		for(int i=0;i<arr.length;i++) {  
			
			for(int j=0;j<arr[i].length;j++) {
				int high=arr[i][j][0];
				double sum=0;
				for(int k=0;k<arr[i][j].length;k++) {
					
					if(high<arr[i][j][k]) {
						  high+=arr[i][j][k];
					}
					sum+=arr[i][j][k];
					if(topmark<arr[i][j][k]) {
						topmark=arr[i][j][k];
					}
			       
					
				}
				sum=(sum)/arr[i][j].length;
				 System.out.println("average mark for dept "+(i+1)+" class "+(j+1)+" "+sum);
					System.out.println("highest mark for dept "+(i+1)+" class "+(j+1)+" "+high);
			}

		}
		
		System.out.println("overall top mark is :"+ topmark);
		
	}
	

  
	
	


}
