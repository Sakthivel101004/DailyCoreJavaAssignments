package oops;

public class Main {

	public static void main(String[] args) {
		Student__1 one=new Student__1();
		one.dispaly("sakthivel", 6969, 90);
		
		Developer__2 two =new Developer__2("java", "vel", 6969, 450000.657);
		two.display();
		
		BankAccount__3 three=new BankAccount__3() ;
		
		three.setAccountno(1234534);
		System.out.println("\n\nAccount no: "+three.getAccountno());
		
		three.setbalance(5000);
		System.out.println("balance: "+three.getbalance());
		
		
		
		three.deposit(1000);
		System.out.println("balance after deposit: "+three.getbalance());
		
		
		three.withdraw(3000);
		System.out.println("balance after withdraw: "+three.getbalance());
		
		three.display();
		
		System.out.println();
		System.out.println();
		UPIPayment__4 four1=new UPIPayment__4();
		four1.pay();
		
		CardPayment__4  four2 =new CardPayment__4();
		four2.pay();
		CashPayment__4 four3=new CashPayment__4();
		four3.pay();
		
	
		
		

	}

}
