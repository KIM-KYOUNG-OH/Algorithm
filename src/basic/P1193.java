package basic;

import java.util.Scanner;

public class P1193 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int line = 1;
		
		while(x > line*(line+1)/2) {
			line++;
		}
		int th = x-(line-1)*(line)/2;
		if(line%2 == 0) {
			System.out.println(th + "/" + (line+1-th));
			return;
		}else {
			System.out.println((line+1-th)+"/"+th);
			return;
		}
	}

}
