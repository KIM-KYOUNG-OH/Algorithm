package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<2;i++) {
			System.out.println(br.readLine());
		}

	}

}
/***
 * 
 * 14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
 * 
 */
