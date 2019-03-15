package ClassMake;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car1 = new Car(4, "현대", 60);
		Car car2 = new Car(4, "기아", 190);
		
//		car.setSpeed(15);
//		car1.setSpeed(30);
//		car.setName("유진차");
		
//		System.out.println(car2.toString());
//		System.out.println(car.toString());
		car.speed();
		car1.speed();
		car2.speed();
	
	
	
	
	}

}
