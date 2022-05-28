package Main;

import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 4, 7, 5 };
	    String a = Arrays.toString(arr);
		String[] arr2  = new String[] {a};
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[] {2,3,4,5,6};
        int[] arr4 = new int[] {};
        String b = Arrays.toString(arr3);
       System.out.println(Arrays.fill(arr4 ,b));//bir methodla yazdim amma basga method alinmadi.
	}

}
