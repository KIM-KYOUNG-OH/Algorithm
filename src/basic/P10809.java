package basic;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		for (char alp = 'a'; alp <= 'z'; alp++) {
			System.out.print(s.indexOf(alp) + " ");
		}
		
	}

}
