package ClassMake;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car1 = new Car(4, "����", 60);
		Car car2 = new Car(4, "���", 190);
		
//		car.setSpeed(15);
//		car1.setSpeed(30);
//		car.setName("������");
		
//		System.out.println(car2.toString());
//		System.out.println(car.toString());
		car.speed();
		car1.speed();
		car2.speed();
	
	
	
	
	}

}
