package Array_Methods;

import java.util.Arrays;

public class Array_Methods {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 5, 6, 7, 8, 4 };
		int[] arr2 = new int[] { 1, 2, 4, 5, 8, 6 };
		int[] arr3=new int[arr.length];
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(Arrays.copyOf(arr2, 3)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr2, 1, 5)));
		System.out.println(Arrays.equals(arr, arr2));
		Arrays.fill(arr, 10);
		for(int i =0;i<arr.length;i++) {
			arr3[i]=arr[i];
		}
		for(int i:arr3) {
			System.out.println(i+" ");
		}
		
	}

}