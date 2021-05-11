package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10828 {
	private static int[] stack;
	private static int size;
	
	public static void push(int data) {
		stack[size] = data;
		size++;
	}//push
	
	public static int pop() {
		
		if(size == 0) {
			return -1;
		} else {
			int result = stack[size-1];
			size--;
			return result;
		}//end else
	}//pop
	
	public static int size() {
		return size;
	}//size
	
	public static int empty() {
		if(size == 0) {
			return 1;
		} else {
			return 0;
		}//end else
	}//empty
	
	public static int top() {
		if(size == 0) {
			return -1;
		} else {
			return stack[size-1];
		}//end else
	}//top
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer stk;
		
			int N = Integer.parseInt(br.readLine());
			
			stack = new int[N];
			
			
			while(N-- > 0) {
				stk = new StringTokenizer(br.readLine(), " ");
				
				switch(stk.nextToken()) {
				case "push":
					push(Integer.parseInt(stk.nextToken()));
					break;
					
				case "pop":
					sb.append(pop()).append("\n");
					break;
				
				case "size":
					sb.append(size()).append("\n");
					break;
					
				case "empty":
					sb.append(empty()).append("\n");
					break;
					
				case "top":
					sb.append(top()).append("\n");
					break;
				}//end switch
			}//end while
			System.out.println(sb);
		
	}//main

}//class
