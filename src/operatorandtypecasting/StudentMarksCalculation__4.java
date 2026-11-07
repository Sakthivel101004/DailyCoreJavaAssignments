package operatorandtypecasting;


/*
Student Marks Calculation

  A student has scored 85 marks out of 100. Store the marks as int, but calculate the percentage as a double.

Question:
Write a Java program using type casting and arithmetic operators to calculate and display the percentage.
 */

public class StudentMarksCalculation__4 {
	
	
	void percentage(int mark) {
		int total=100;
		System.out.println("scored: "+mark);
		System.out.println("total mark: "+ total);
		System.out.println("percentage: "+((double)mark/total)*100+" %");
	}

}
