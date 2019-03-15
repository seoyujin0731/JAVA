package ClassMake;

import java.util.Scanner;

public class 계산기_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		계산기 value = new 계산기();
		value.sum(a, b);
        value.minus(a, b);
        value.multi(a, b);
        value.division(a, b);
	}

}
