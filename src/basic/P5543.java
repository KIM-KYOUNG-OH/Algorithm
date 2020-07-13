package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5543 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int hamburger = 2001;
		int drink = 2001;
		
		for(int i=0; i<3; i++) {
			int value = Integer.parseInt(br.readLine());
			if(value<hamburger) {
				hamburger = value;
			}
		}
		for(int j=0; j<2; j++) {
			int value = Integer.parseInt(br.readLine());
			if(value<drink) {
				drink = value;
			}
		}
		int sum = hamburger+drink;
//		System.out.println(hamburger+drink-50);
		bw.write(sum-50+"\n");
		bw.flush();
//		bw.close();
	}
	
}
