package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1008 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			
			System.out.println(a/b);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
