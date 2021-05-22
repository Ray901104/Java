package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//정수의 개수 N을 입력
		int N = Integer.parseInt(br.readLine());
		
		//길이가 N인 정수의 배열 numArr를 선언
		int[] numArr = new int[N];
		
		//N개의 정수를 공백으로 구분해서 저장하기 위한 StringTokenizer 선언
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		//N개의 정수를 공백으로 구분해서 정수 배열 numArr에 할당
		for(int i = 0; i < numArr.length; i++){
			numArr[i] = Integer.parseInt(stk.nextToken());
		}//end for
		
		//numArr에서 최솟값과 최댓값을 뽑아내기 위한 변수 선언
		int min = numArr[0];
		int max = numArr[0];
		
		for(int i = 1; i < numArr.length; i++) {
			//변수 max에 할당된 numArr의 0번째 요소 값과 이후의 모든 요소 값들을 하나씩 비교하여
			//max보다 큰 요소의 값이 있을 때마다 해당 값을 max에 새롭게 할당
			if(max < numArr[i]) {
				max = numArr[i];
			}//end if
			
			//변수 min에 할당된 numArr의 0번째 요소 값과 이후의 모든 요소 값들을 하나씩 비교하여
			//min보다 작은 요소의 값이 있을 때마다 해당 값을 min에 새롭게 할당
			if(min > numArr[i]) {
				min = numArr[i];
			}//end if
			
		}//end for
		
		//최솟값 min과 최댓값 max의 값을 공백으로 구분하여 출력
		System.out.println(min + " " + max);
	}//main

}//class
