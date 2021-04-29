package day3;

public class For7 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누어서 떨어지는 수, 
		 * 6의 약수는 1,2,3,6 
		 * 공약수 : 공통으로 있는 약수 
		 * 12의 약수 1, 2, 3, 4, 6, 12
		 * 8과 12의 공약수 : 1, 2, 4
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 8과 12의 최대 공약수 : 4 
		 */
		
		int a, num1 = 8, num2 =12 ;
		for (a = 1 ; a <= num1 ; a += 1 ) {
			if(num1 % a == 0 && num2 % a == 0) {
		
			}
		}
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 : ", a);
	 }
  }

		

		
	


