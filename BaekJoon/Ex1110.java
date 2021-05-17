package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//정수 N을 입력받는다.
		int copyN = N;//정수 N과 비교하기 위해 N의 값을 저장한 변수를 하나 더 만든다.
		int cnt = 0;//사이클의 길이를 저장하기 위한 변수를 선언한다.
		
		//최초로 1회는 수행해야하기 때문에, while(true)로 무한루프를 만들어두고, if문을
		//추가하여 while문을 종료할 수 있는 조건을 만든다.
		while(true) {
			//새로운 N의 십의 자리는 원래의 수를 10으로 나눈 나머지에 10을 곱한 값이고,
			//새로운 N의 일의 자리는 원래의 수를 10으로 나눈 몫과 원래의 수를 10으로 나눈 나머지를 더하고,
			//그 수를 10으로 나눈 나머지와 같다.
			N = ((N%10)*10)+(((N/10)+(N%10))%10);//새로운 십의 자리수 + 일의 자리수를 더하여 새로운 수 N이 만들어진다.
			
			cnt++;//새로운 수 N을 만들때 마다 cnt를 1씩 증가시켜 사이클의 길이를 센다.
			
			//최초에 입력된 정수 N의 값을 가지고 있는 copyN과 새로 만들어진 N을 비교하여, 같을 경우
			//while문을 빠져나온다.
			if(copyN == N) {
				break;
			}//end if
				
		}//end while
		
		//최초에 입력된 정수 N이 다시 원래의 값으로 돌아올 때 까지의 사이클(cnt)의 길이를 출력한다.
		System.out.println(cnt);
	}//main

}//class
