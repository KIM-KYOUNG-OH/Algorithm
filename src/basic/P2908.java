package basic;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.next();
		String num2 = scanner.next();
		scanner.close();
		char[] arr1 = new char[3];
		char[] arr2 = new char[3];
		
		for(int i=0; i<3; i++) {
			arr1[2-i] = num1.charAt(i);
		}
		int rev1 = (arr1[0]-48)*100 + (arr1[1]-48)*10 + (arr1[2]-48);
		
		for(int i=0; i<3; i++) {
			arr2[2-i] = num2.charAt(i);
		}
		int rev2 = (arr2[0]-48)*100 + (arr2[1]-48)*10 + (arr2[2]-48);
		
		if(rev1 > rev2) {
			System.out.println(rev1);
		} else System.out.println(rev2);
	}

}
