package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArr = new int[9];
		
		//numArr �迭 �� ��ҿ� ���� �Ҵ��ϴ� for��
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}//end for
		
		int max = 0;//�ִ��� �����ϱ� ���� ����
		int max_loc = 0;//�� ��° �������� �����ϱ� ���� ����
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
				max_loc = i+1;
			}//end if
		}//end for
		
		//�ִ񰪰� ��ġ�� ���
		System.out.println(max);
		System.out.println(max_loc);

	}//main

}//class
