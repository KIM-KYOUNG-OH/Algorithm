package basic;

import java.util.Scanner;

public class P2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int number1 = B%10;
		int number2 = (B%100)/10;
		int number3 = B/100;
		
		System.out.println(A*number1);
		System.out.println(A*number2);
		System.out.println(A*number3);
		System.out.println(A*B);
		
	}

}
