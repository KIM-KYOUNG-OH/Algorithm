package basic;

import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next().toUpperCase();
		int[] alp = new int[26];
		int max = 0;
		char result = '?';
		for(int i =0;i<s.length();i++) {
			alp[s.charAt(i)-65]++;
			if(alp[s.charAt(i)-65] > max) {
				max++;
				result = s.charAt(i);
			} else if(alp[s.charAt(i)-65] == max) {
				result = '?';
			}
		}
		System.out.println(result);
	}

}
