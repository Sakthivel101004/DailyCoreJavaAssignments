package array;
import java.util.Scanner;

/*
Question 1 – 1D Array: Student Marks
A teacher stores marks of 10 students in an array.
Write a Java program to:
Get 10 student marks from the user.
Display all marks.
Find the highest and lowest marks.
Calculate the average.
Count the number of passed and failed students (Pass mark = 35).
 */


public class Array1D__1 {
	Scanner scan=new Scanner(System.in);
	
	 public void display(){
		 
            int []mark= new int[10];       //Get 10 student marks from the user.
              
              for(int i=0;i<mark.length;i++) {
            	  System.out.print("enter the mark "+i+": ");
            	  mark[i]=scan.nextInt();
            	  
              }
              
              for(int arr:mark) {     //  Display all marks.
            	  System.out.println(arr);
              }
              
              int high=mark[0];          //Find the highest and lowest marks.
              int low=mark[0];
              
              for(int i=1;i<mark.length;i++) {
            	  if(high<mark[i]) {
            		  high=mark[i];
            		  
            	  }
            	  if(low>mark[i]) {
            		  low=mark[i];
            	  }
              }
              
              System.out.println("Highest mark is "+high);
              System.out.println("Lowest mark is "+low);
              
             
              int avg=0;         //Calculate the average.
              for(int a:mark) {
            	  avg+=a;
            	  	  
              }
              System.out.println("Average is "+avg);
              
             
              int count=0;          //Count the number of passed and failed students (Pass mark = 35)
              int pass=35;
              
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>=pass) {
			
			count ++;
			
			}
			
		}
		
		System.out.println("no of passed students : "+count);
		int fail=mark.length -count;
		System.out.println("no of failed studetns :"+fail);
	}
	
	
	
	

}
