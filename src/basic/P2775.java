package basic;

import java.util.Scanner;

public class P2775 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] apt = new int[15][15];
		
		for(int i=0; i<15; i++) {
			apt[i][1]=1;
			apt[0][i] = i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];	
			}
		}
		int num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			int k=scanner.nextInt();
			int n=scanner.nextInt();
			System.out.println(apt[k][n]);
		}
	}

}
