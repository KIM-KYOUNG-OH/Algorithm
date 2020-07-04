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
//		String s = bf.readLine(); //String��
//		StringTokenizer st = new StringTokenizer(s); //������� ������ ����
//		String array[] = s.split(" "); //����ó��
		int n = Integer.parseInt(br.readLine()); //int����ȯ
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
