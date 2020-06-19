package basic;

import java.util.Scanner;

public class P2438 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			String s="";
			for(int j=0;j<=i ; j++) {
				s+="*";
			}
			System.out.println(s);
		}
	}

}
