package earlybinding;

public class CarDriver 
{

	public static void main(String[] args) 
	{
		Car c1=new Car("Black", "TATA", "NEXON", "SUV", 1500000, 13.5);
		c1.displayCar();
		
		c1.e1.displayEngine();
		
		Car c2=new Car("WHITE", "TATA", "NEXON", "SUV", 1250000, 14);
		c2.displayCar();
		
		c2.e1.displayEngine();
	}

}
