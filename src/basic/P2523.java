package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P2523 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=(num*2-1); i++) {
			if( i <= num) {
				for(int j =1; j <= i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}else {
				for(int j=1; j <= (num*2-i); j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
	}

}
