package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//���� N�� �Է¹޴´�.
		int copyN = N;//���� N�� ���ϱ� ���� N�� ���� ������ ������ �ϳ� �� �����.
		int cnt = 0;//����Ŭ�� ���̸� �����ϱ� ���� ������ �����Ѵ�.
		
		//���ʷ� 1ȸ�� �����ؾ��ϱ� ������, while(true)�� ���ѷ����� �����ΰ�, if����
		//�߰��Ͽ� while���� ������ �� �ִ� ������ �����.
		while(true) {
			//���ο� N�� ���� �ڸ��� ������ ���� 10���� ���� �������� 10�� ���� ���̰�,
			//���ο� N�� ���� �ڸ��� ������ ���� 10���� ���� ��� ������ ���� 10���� ���� �������� ���ϰ�,
			//�� ���� 10���� ���� �������� ����.
			N = ((N%10)*10)+(((N/10)+(N%10))%10);//���ο� ���� �ڸ��� + ���� �ڸ����� ���Ͽ� ���ο� �� N�� ���������.
			
			cnt++;//���ο� �� N�� ���鶧 ���� cnt�� 1�� �������� ����Ŭ�� ���̸� ����.
			
			//���ʿ� �Էµ� ���� N�� ���� ������ �ִ� copyN�� ���� ������� N�� ���Ͽ�, ���� ���
			//while���� �������´�.
			if(copyN == N) {
				break;
			}//end if
				
		}//end while
		
		//���ʿ� �Էµ� ���� N�� �ٽ� ������ ������ ���ƿ� �� ������ ����Ŭ(cnt)�� ���̸� ����Ѵ�.
		System.out.println(cnt);
	}//main

}//class
