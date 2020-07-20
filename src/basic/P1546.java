package basic;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double[] arr = new double[N];
		for (int i = 0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		double sum = 0;
		
		for(int i=0; i<(N-1); i++) {
			sum += (arr[i]/(arr[N-1]))*100;
		}
		sum += arr[N-1];
		System.out.println(sum/N);
	}

}
