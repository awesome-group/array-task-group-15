package ifelse;

import java.util.Scanner;
import java.util.Arrays;

public class Ifelse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
//		if(a % 2==0) {
//			System.out.println(a+" 2-ye bolunur.");
//		}
//		else {
//			System.out.println(a+" 2-ye qaliqli bolunur.");
//		}
//		if(a % 3==0) {
//			System.out.println(a+" 3-e bolunur.");
//		}
//		else {
//			System.out.println(a+" 3-e qaliqli bolunur.");
//		}
//		if(a % 4==0) {
//			System.out.println(a+" 4-e bolunur.");
//		}
//		else {
//			System.out.println(a+" 4-e qaliqli bolunur.");
//		}
//		if(a % 2==0) {
//			System.out.println(a+" cutdur.");
//		}
//		else {
//			System.out.println(a+" tekdir");
//		}
//		
//		long[] l1 = { 2, 3, 10, 5, 9, 4, 6 };
//
//		Arrays.fill(l1, a);
//
//		for (long l : l1) {
//			System.out.println(l);
//		}
		int[] numbers = new int[] {10,46,23,28,13,69,128,385,839};

		int big = numbers[0];
		for (int n : numbers) {
			if (n > big) {
				big = n;
			}
		}

		System.out.println("En boyek eded :" + big);

		int small = numbers[0];
		for (int n : numbers) {
			if (n < small) {
				small = n;
			}
		}

		System.out.println("En kick eded :" + small);

	}
}