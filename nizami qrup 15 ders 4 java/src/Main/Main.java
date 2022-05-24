package Main;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,8,5,6,7,10};
		int max = 8;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("en boyuk reqem " + max);
	}

}
