package basic;

import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			int H=scanner.nextInt();
			int W=scanner.nextInt();
			int N=scanner.nextInt();
			
			int yy=N%H;
			int xx=N/H+1;
			if(N%H == 0) {
				yy=H;
				xx=N/H;
			}
			System.out.println(yy*100+xx);
		}
	}
}
