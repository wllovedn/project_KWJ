package day3;

public class for5 {

	public static void main(String[] args) {
		/* 1부터 5까지의 합을 구하는 예제
		 * 반복횟수 : y는 1부터 5까지 1씩증가
		 * 규칙성 : sum = sum + y를 실행 ( sum += y)
		 * sum = 0
		 * */
		int a, sum = 0;
		
		for(a=1; a <=5 ; a++) {
			sum+=a;
			
		}
		System.out.println("1부터 5까지의 합 :" + sum);
		
	}

}
