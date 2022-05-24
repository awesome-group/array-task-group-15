package main;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {10,5,3,2,1};
		int max =arr[0];
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i]> max)
			max = arr[i];
		}
		System.out.println("en boyuk eded" + max);
	}
}
