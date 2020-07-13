package basic;

import java.util.Scanner;

public class P10039 {

	public static void main(String[] args) {
	
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			score[i] = scanner.nextInt();
			if(score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		System.out.println(sum/5);
	}
}
