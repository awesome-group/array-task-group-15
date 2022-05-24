package Main;

import java.util.Scanner;

public class massivinicindekilkerideyisme {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int b = sc.nextInt();
	   int[] arr = new int[] {1,2,3,4,8,5,6,7,10};
	   int i = 0;
	   while(i< arr.length) {
		   i++;
			arr[i] = b;
		}
	   System.out.println(arr[i]);
	}

}
