package earlybinding;

public class Car 
{
	String brand;
	String name;
	String color;
	String type;
	double price;
	double mileage;
	
	Engine e1=new Engine(4, "Petrol", 1000, 4, 15, "Oil Cooled");
	
	Car(){};
	
	public Car(String color, String brand, String name, String type, double price, double mileage)
	{
		System.out.println("Car getting Ready");
		
		this.color=color;
		this.brand=brand;
		this.name=name;
		this.type=type;
		this.price=price;
		this.mileage=mileage;
	}
	
	public void displayCar()
	{
		System.out.println("Brand ----> " +brand);
		System.out.println("Name ----> " +name);
		System.out.println("Type of Car ----> " +type);
		System.out.println("Price ----> " +price);
		System.out.println("Color ----> " +color);
		System.out.println("Mileage ----> " +mileage);
	}
}
