package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int X = Integer.parseInt(arr[1]);
		String[] array = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			if(Integer.parseInt(array[i]) < X ) {
				bw.write(array[i] + " ");
			} else continue;
		}
		bw.flush();
	}

}
