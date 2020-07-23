package basic;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String value = scanner.next();
		int sum = 0;
		
		if(value.length() == num) {
			for(int i=0; i<num; i++) {
				
				sum += value.charAt(i)-'0';
			}
			
			System.out.println(sum);
		}
	}
}
