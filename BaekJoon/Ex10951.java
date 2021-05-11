package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		int A, B;
		String input = "";
		
		//print A+B using End of File(EOF)
		while((input = br.readLine()) != null) {
			stk = new StringTokenizer(input, " ");
			A = Integer.parseInt(stk.nextToken());
			B = Integer.parseInt(stk.nextToken());
			System.out.println(A+B);
		}//end while
		
	}//main

}//class
