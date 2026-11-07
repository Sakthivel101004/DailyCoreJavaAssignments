package operatorandtypecasting;

/*
5. Product Price Calculation
A product costs 999.50. The customer buys 3 products and receives a discount of 10%.

Question:
Write a Java program using type casting, arithmetic operators, and assignment operators to calculate the final price.
*/

public class ProductPriceCalculation__5 {

	void calculation() {
		double cp=999.50;
		System.out.println("cost_price: "+cp);
		
	     int  items=3;
	     System.out.println("no of items :"+ items);
	     
	     double total_price=cp*items;
	     System.out.println("cost price for three items: "+total_price);
	     
	     double discount=10;
	     System.out.println("discount: "+discount+" %");

//	     double discount_amt=(total_price * discount)/100;
	     double discount_amt=total_price*((double)discount/100);
	     System.out.println("discount_amt: "+discount_amt);
	     
	      total_price -=discount_amt;
	      System.out.println("Final_price: "+ total_price);
	     
	     
	     
	     
	    
	     
	     
		
	}
}
