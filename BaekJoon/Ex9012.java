package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex9012 {

	public String solve(String s) {
		Stack<String> stack = new Stack<String>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(String.valueOf(c));
			} else if(stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}//end else
		}//end for
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}//end else
		
	}//solve
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Ex9012 ex = new Ex9012();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append(ex.solve(br.readLine())).append("\n");
		}//end for
		
		System.out.println(sb);
		
	}//main

}//class
