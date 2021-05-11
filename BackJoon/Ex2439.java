package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = i; j<N-1; j++) {
				System.out.print(" ");
			}//end for
			
			for(int k = 0; k<i+1; k++) {
				System.out.print("*");
			}//end for
			System.out.println();
		}//end for
	}//main

}//class
