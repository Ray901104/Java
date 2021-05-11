package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10773 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int item;
		
		for(int i = 0; i < K; i++) {
			item = Integer.parseInt(br.readLine());
			
			if(item == 0 && !stack.isEmpty()) {
				stack.pop();
			} else if(item != 0) {
				stack.push(item);
			}//end if
		}//end for
		
		int sum = 0;
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}//end while
		
		System.out.println(sum);
		
	}//main

}//class
