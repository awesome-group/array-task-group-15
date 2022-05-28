package main;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 4, 5, 6, 7, 16,};
		int[] arr2 = new int[] {1 , 3,  4, 5, 6, 7, 17};
		int[] arr3 = new int[arr.length];
		 System.out.println(Arrays.binarySearch(arr, 7)); //Arrayin daxilinde  baslayaraq ededi axtarir ve indexsini verir.
		 System.out.println(Arrays.toString(Arrays.copyOf(arr2, 15))); // Arrayi artirir.
		 System.out.println(Arrays.toString(arr));// Arrayi capa verir.
		 System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1, 5)));// arraydan index e uygun olaraq qiymetleri alir
		 System.out.println(Arrays.equals(arr, arr2));// arraylari muqaise edir
		 Arrays.fill(arr, 14);//arrayin butun elementlerine verilen deyer
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println(Arrays.toString(arr3));
		 
		 int[] arr4 = new int[] {23,324,532,534,235,745,35352,537};
			int max =arr4[0];
			for(int i = 0; i < arr4.length ; i++) {
				if(arr4[i]> max)
				max = arr4[i];
			}
			System.out.println("En Boyuk Eded" +" "+ max);
	} 
}
