package basic;

import java.util.Scanner;

public class P3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] remains = new int[10];
		
		for(int i=0;i<10;i++) {
			remains[i] = (scanner.nextInt())%42;
		}
		
		int count = 10;
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(remains[i] == remains[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
