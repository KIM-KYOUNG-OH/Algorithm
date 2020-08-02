package basic;

import java.util.Scanner;

public class P2292 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int i = 1;
		while( true ) {
			if(n<=3*i*i-3*i+1) {
				System.out.println(i);
				return;
			}else {
				i++;
			}
		}
	}
}
