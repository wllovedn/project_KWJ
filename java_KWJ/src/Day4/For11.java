package Day4;

public class For11 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성
		 * 8의 배수 : 8, 16, 24, 32 ...
		 * 12의 배수 : 12, 24, 36, 48 ...
		 * 8과 12의 공배수 : 24, 48, 72 ...
		 *8과 12의 최소 공배수 : 24 
		 *반복횟수  :
		 *규칙성   :
		 *반복문 종료 후 :
		 *
		 **/
	
		int a, num1 = 10000, num2 = 20000;
		for(a = 1 ; a <= num1 * num2 ; a += 1) {
			if(a % num1 == 0 && a % num2 == 0) {
				break;
			}
		}
		/* 반복횟수  : a는 num1부터 무한대로 a는 num1씩 증가
		 * 규칙석   : a가 num2의 배수이면 a를 출력후 반복문 종료    
		 */
		for(a = num1 ; 	; a += num1) {
			if(a % num2 == 0) {
				System.out.println(a);
				break;
		   }

}
