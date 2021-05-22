package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArr = new int[9];
		
		//numArr 배열 각 요소에 값을 할당하는 for문
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}//end for
		
		int max = 0;//최댓값을 저장하기 위한 변수
		int max_loc = 0;//몇 번째 수인지를 저장하기 위한 변수
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
				max_loc = i+1;
			}//end if
		}//end for
		
		//최댓값과 위치를 출력
		System.out.println(max);
		System.out.println(max_loc);

	}//main

}//class
