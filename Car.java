package ClassMake;

public class Car {

	private int wheel;
	private String name;
	private double speed;

	final double Maxspeed = 180;

	public Car() {
		this.wheel = 0;
		this.name = "이름없음.";
		this.speed = 0;

	}

	public Car(int wheel, String name, double speed) {
		this.wheel = wheel;
		this.name = name;
		this.speed = speed;

	}

	public void speed() {
		if (speed < Maxspeed) {

			System.out.println("안전운행중");
		} else {
			System.out.println("속도위반입니다.");
		}

	}

}
