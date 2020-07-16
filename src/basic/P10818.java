package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P10818 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n =Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] array = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		Arrays.sort(arr);
		bw.write(arr[0] + " " + arr[n-1]);
		bw.close();
	}
}
