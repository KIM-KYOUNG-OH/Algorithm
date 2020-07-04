package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String s = bf.readLine(); //String형
//		StringTokenizer st = new StringTokenizer(s); //공백단위 데이터 가공
//		String array[] = s.split(" "); //공백처리
		int n = Integer.parseInt(br.readLine()); //int형변환
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write((a+b)+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
