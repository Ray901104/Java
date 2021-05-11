package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		
		int T = Integer.parseInt(br.readLine());
		int A,B;
		
		for(int i = 1; i < T+1; i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(stk.nextToken());
			B = Integer.parseInt(stk.nextToken());
			
			System.out.println("Case #" + i + ": " + (A+B));
		}//end for
	}//main

}//class
