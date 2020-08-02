package basic;

import java.util.Scanner;

public class P1316 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	static boolean check() {
		boolean[] alp = new boolean[26];
		String str = scanner.next();
		int prev = 0;
		
		for(int i=0;i<str.length();i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(alp[now-'a'] == false) {
					alp[now-'a'] = true;
					prev = now;
					
				}else return false;
			}else continue;
		}
		return true;
	}

}
