package basic;

import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		String str = Integer.toString(A*B*C);
		
		for(int i=0;i<10;i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
