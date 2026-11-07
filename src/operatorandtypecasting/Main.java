package operatorandtypecasting;

public class Main {
	
	public static void main(String []args) {
		ArithmeticOperator__1 one=new ArithmeticOperator__1();
		one.sum(10,20);
		one.difference(10,20);
		one.prodiuct(10,20);
		one.divison(10,20);
		
		RelationalOperator__2 two=new RelationalOperator__2();
		two.compare(20,28 );
		
		AssignmentOperator__3 three=new AssignmentOperator__3();
		three.assign(50);
		
		StudentMarksCalculation__4 four=new StudentMarksCalculation__4();
		four.percentage(50);
		
		ProductPriceCalculation__5 five=new ProductPriceCalculation__5();
		five.calculation();
		
		
	}
	

}
