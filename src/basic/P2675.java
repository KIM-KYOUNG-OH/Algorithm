package basic;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 0;i<n;i++) {
			
			int repeat = scanner.nextInt();
			String s = scanner.next();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<repeat;k++) {
					System.out.print(s.charAt(j));	
				}
			}
			System.out.println();
		}
	}
}
