package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//������ ���� N�� �Է�
		int N = Integer.parseInt(br.readLine());
		
		//���̰� N�� ������ �迭 numArr�� ����
		int[] numArr = new int[N];
		
		//N���� ������ �������� �����ؼ� �����ϱ� ���� StringTokenizer ����
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		//N���� ������ �������� �����ؼ� ���� �迭 numArr�� �Ҵ�
		for(int i = 0; i < numArr.length; i++){
			numArr[i] = Integer.parseInt(stk.nextToken());
		}//end for
		
		//numArr���� �ּڰ��� �ִ��� �̾Ƴ��� ���� ���� ����
		int min = numArr[0];
		int max = numArr[0];
		
		for(int i = 1; i < numArr.length; i++) {
			//���� max�� �Ҵ�� numArr�� 0��° ��� ���� ������ ��� ��� ������ �ϳ��� ���Ͽ�
			//max���� ū ����� ���� ���� ������ �ش� ���� max�� ���Ӱ� �Ҵ�
			if(max < numArr[i]) {
				max = numArr[i];
			}//end if
			
			//���� min�� �Ҵ�� numArr�� 0��° ��� ���� ������ ��� ��� ������ �ϳ��� ���Ͽ�
			//min���� ���� ����� ���� ���� ������ �ش� ���� min�� ���Ӱ� �Ҵ�
			if(min > numArr[i]) {
				min = numArr[i];
			}//end if
			
		}//end for
		
		//�ּڰ� min�� �ִ� max�� ���� �������� �����Ͽ� ���
		System.out.println(min + " " + max);
	}//main

}//class
