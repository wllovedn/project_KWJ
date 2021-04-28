package day3;

public class for6 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 코드를 작성하세요.
		 *예시
		 *정수를 입력하세요 : 6
		 *1 2 3 6
		 *정수 : num
		 *반복횟수 : a는 1부터 num까지 1씩 증가
		 *   초기화 : a는 1부터
		 *   조건식 : a는 num까지, a는 num보다 작거나 같다
		 *   증감식 : a를 1씩 증가
		 *규칙성 : a가 num의 약수이면 a를 출력
		 *      => num를 a로 나누었을 때 나머지가 0과 갔다면 a를 출력
		 *반복문 종료 후 : 없음
		 */

		int a , num = 12 ;
		
		for (a = 1 ; a <=num ; a += 1) {
		
			if (num % a == 0 ) { 
			   //6 나누기 1은 0과 같다. 
				System.out.print(a + "  ");
			}
		}
	}
}