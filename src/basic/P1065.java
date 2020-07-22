package basic;

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		if(n<100) {
			System.out.println(n);
		} else if(n>=100 && n<1000) {
			int result = 99;
			for(int i =100; i<=n; i++) {
				result += checkHansu(i);
			}
			System.out.println(result);
		} else if (n == 1000) {
			System.out.println(144);
		}
		
	}
	
	private static int checkHansu(int n) {
		int num3 = n/100;
		int num2 = (n/10)%10;
		int num1 = n%10;
		if(num3-num2 == num2-num1)
		return 1;
		else return 0;
	}

}
