package basic;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		int N = 0;
		
		double avg = 0;
		int[] arr = new int[1000];
		
		for(int i = 0;i<C;i++) {
			N = scanner.nextInt();
			int total = 0;
			int num = 0;
			
			for(int j=0; j<N;j++) {
				arr[j] = scanner.nextInt();
				total += arr[j];
			}
			avg = (double)total / N;
			
			for(int j=0; j<N;j++) {
				if(arr[j]>avg) {
					num++;
				}
			}
			System.out.printf("%.3f", 100.0*num/N);
			System.out.println("%");
		}
	}
}
