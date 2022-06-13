package main;

import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {

		double pow = pow(5, 4);
		double sqrt = sqrt(81);
		double abs = abs(-169.53);
		double floor = floor(3.99);
		double ceil = ceil(5.01);
		double round = round(129.43);
		int random = (int) (random() * 10) + 1;
		System.out.println(pow(4, 7));
		System.out.println(sqrt(49));
		System.out.println(abs(-196.6));
		System.out.println(floor(12.99));
		System.out.println(ceil(16.03));
		System.out.println(round(95.46));
		System.out.println((int) (random() * 10) + 1);
		System.out.println(PI);
		System.out.println(E);
		System.out.println();
		
		System.out.println(toDegrees(0.5));
		System.out.println(toDegrees(1));
		System.out.println(toDegrees(1.5));
		System.out.println();
		
		System.out.println(toRadians(28.64788975654116));
		System.out.println(toRadians(57.29577951308232));
		System.out.println(toRadians(85.94366926962348));
		System.out.println();
		
		System.out.println(sin(toRadians(0)));
		System.out.println(sin(toRadians(45)));
		System.out.println(sin(toRadians(90)));
		System.out.println();
		
		System.out.println(toDegrees(asin(0)));
		System.out.println(toDegrees(asin(0.7071067811865476)));
		System.out.println(toDegrees(asin(1)));
		
	}

}
