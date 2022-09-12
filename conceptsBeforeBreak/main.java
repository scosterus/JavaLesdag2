package conceptsBeforeBreak;

import java.sql.Time;

public class main {
	public static void main(String[] args) {
		
		Car c1 = new Car(12000);
		c1.brand = "Porsche";
		System.out.println(c1.brand);
		System.out.println(c1.year);
		c1.carEngine.horsePower = 333;
		System.out.println(c1.carEngine.horsePower);
		System.out.println(c1.getAge());
		
	}
}

class Car{
	Car(int price){
		System.out.println("The price of this car is: $" + price);
	}
	Engine carEngine = new Engine();
	
	final int year = 1966;
	String brand;
	String model;
	
	int getAge() {
	 return 2022 - year;
	}
	
}
class Engine{
	int horsePower;
}