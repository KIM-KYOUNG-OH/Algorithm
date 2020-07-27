package basic;

import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		} else {
			String[] arr = str.split(" ");
			System.out.println(arr.length);
		}
	}
	
}
