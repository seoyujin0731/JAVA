package ClassMake;

import java.util.Scanner;

public class ����_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		���� value = new ����();
		value.sum(a, b);
        value.minus(a, b);
        value.multi(a, b);
        value.division(a, b);
	}

}
