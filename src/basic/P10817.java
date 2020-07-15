package basic;

import java.util.Arrays;
import java.util.Scanner;

public class P10817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1;
		int[] arr = new int[3];
		
		for(int i=0;i<3;i++) {
			arr[i]=in.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
