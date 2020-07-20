package basic;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] cases = new String[n];

 		for(int i=0;i<n;i++) {
			cases[i] = scanner.next();
 		}
		for(int j =0;j<n;j++) {
			int count = 0;
			int total = 0;
			for(int i=0;i<cases[j].length(); i++) {
				if(cases[j].charAt(i)== 'O') {
					total += ++count;
				}else {
					count =0;
				}
			}
			System.out.println(total);
		}
	}
}
