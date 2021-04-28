package day3;

public class Test3_6 {

	public static void main(String[] args) {
		/* 1부터 10까지의 짝수들의 합을 구하는 예제
		 * 
		 */
		int a, sum=0 ;
		for(a=1 ; a<=100 ; a=a+2) {
			sum = sum + a;
		}
			System.out.println("1부터 10까지의 짝수들의 합 : " + sum);
		}
	}


