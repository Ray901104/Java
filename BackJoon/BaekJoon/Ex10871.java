package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int X = Integer.parseInt(stk.nextToken());
		
		StringTokenizer stk1 = new StringTokenizer(br.readLine(), " ");
		int A;
		for(int i = 0; i < N; i++) {
			A = Integer.parseInt(stk1.nextToken());
			if(X > A) {
				System.out.print(A + " ");
			}//end if
		}//end for
		
	}//main

}//class
