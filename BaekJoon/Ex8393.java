package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum=0;
		
		for(int i=0; i<N+1; i++) {
			sum+=i;
		}//end for
		
		System.out.println(sum);
	}//main

}//class
