package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//initialize variables
		StringTokenizer stk;
		int A, B;
		
		while(true) {
			//get input(values) from a system, then set these values to A, B
			stk = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(stk.nextToken());
			B = Integer.parseInt(stk.nextToken());
			
			//if input values are both zero, break
			if(A==0 && B==0) {
				break;
			}//end if
			
			//if both A and B are not zero, print sum of A and B
			System.out.println(A+B);
			
		}//end while
		
	}//main

}//class
