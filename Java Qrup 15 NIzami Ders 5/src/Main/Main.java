package Main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[] { 1, 3, 3, 4, 5 };
		int[] arr4 = new int[] { 1, 3, 3, 4, 5 };
		System.out.println(Arrays.binarySearch(arr4,2));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 10)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 3)));
		System.out.println(Arrays.equals(arr, arr2));
		System.out.println(Arrays.equals(arr, arr3));
		Arrays.fill(arr, 2);
		System.out.println(Arrays.toString(arr));

	}
}
