package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10430 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s = br.readLine();
			StringTokenizer stk = new StringTokenizer(s, " ");
			
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			
			System.out.println((a+b) % c);
			System.out.println(((a%c) + (b%c)) % c);
			System.out.println((a*b) % c);
			System.out.println(((a%c) * (b%c)) % c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
