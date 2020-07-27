package basic;

import java.util.Scanner;

public class P2941 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		scanner.close();
		
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<croatia.length;i++) {
			str = str.replaceAll(croatia[i], "a");
		}
		System.out.println(str.length());
		
	}
}
