package basic;

import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int number = n;
		int cycle=0;
		
		do {
			number = (number%10)*10 + (number/10+number%10)%10;
			cycle++;
			} while(n != number);
		System.out.println(cycle);
	}
}
