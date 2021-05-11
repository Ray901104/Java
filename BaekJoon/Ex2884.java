package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2884 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alarm = br.readLine();
		
		StringTokenizer stk = new StringTokenizer(alarm, " ");
		
		int hour = Integer.parseInt(stk.nextToken());
		int min = Integer.parseInt(stk.nextToken());
		
		min = min - 45;

		if(min < 0 ) {
			min = min+60;
			hour--;
		}//end if
		
		if(hour < 0) {
			hour+=24;
		}//end if
		
		System.out.println(hour + " " + min);
		
	}//main

}//class
