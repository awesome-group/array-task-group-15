package main;

import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a=sc.nextInt();
		int b=sc.nextInt();
		
		double pow = pow(4, 7);
		double sqrt = sqrt(25);
		double abs = abs(-129.3);
		double floor = floor(76.9);
		double ceil = ceil(76.02);
		double round = round(32.49);
		int random = (int) (random() * 10) + 1;
		System.out.println(pow(a, b));
		System.out.println(sqrt(a));
		System.out.println(abs(-a));
		System.out.println(floor(a));
		System.out.println(ceil(a));
		System.out.println(round(a));
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
