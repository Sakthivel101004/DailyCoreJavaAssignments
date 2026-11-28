package innerclassandcollection;

public class Car{
	String name="Honda City";
	
	public void display() {
		System.out.println("car name is"+name);
	}
	class engine{
		
	    String type="1.5L i-VTEC petrol (naturally aspirated, inline-4)";
	    
	    public void display() {
	    	System.out.println("engine type is "+type);
	    }
	}

	public static void main(String[] args) {
		
		Car r=new Car();
		r.display();
		
		Car.engine r1=r.new engine();
		r1.display();
		
		
		
		

	}

}
