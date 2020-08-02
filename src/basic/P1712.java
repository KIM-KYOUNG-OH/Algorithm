package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1712 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().trim().split(" ");
		double A = Double.parseDouble(arr[0]);
		double B = Double.parseDouble(arr[1]);
		double C = Double.parseDouble(arr[2]);
		
		if(B>=C) {
		System.out.println(-1);
		}else System.out.println((int)(A/(C-B)+1));
	}

}
