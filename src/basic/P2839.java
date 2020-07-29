package basic;

import java.util.Scanner;

public class P2839 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int temp;
		
		if(n%5 == 0) {
			System.out.println(n/5);
			return;
		} else {
			for(int i=0;i<n/3;i++) {
				temp = n - 3*i;
				if(temp%5 == 0) {
					System.out.println(temp/5 + i);
					return;
				}
			}
			if(n%3 == 0) {
				System.out.println(n/3);
			}else {
				System.out.println(-1);
			}
		}
	}
}
