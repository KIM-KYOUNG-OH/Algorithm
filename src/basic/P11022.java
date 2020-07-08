package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
				
		for ( int i = 1; i <= n; i++) {
			String[] array = br.readLine().split(" ");
			int sum = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
			bw.write("Case #" + i +": " + array[0] + " + " + array[1] + " = " + sum + "\n");
		}
		bw.flush();
	}

}
