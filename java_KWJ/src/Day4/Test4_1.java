package Day4;

public class Test4_1 {

	public static void main(String[] args) {
		/* 11부터 20까지 출력하는 코드를 작성하세요.
		 * 반복횟수  :  a는 11부터 a는 20보다 작거나 같을때까지 a는 1씩 증가
		 * 규칙성   : a를 콘솔에 출력
		 * 반복문 종료 후 : 엑스
		 */
		
		int a ;
		
		for(a = 11 ; a <= 20 ; a +=1 ) {
			
			
		}
       /*20부터 11까지 출력하는 코드를 작성하세요.
        *반복횟수  : b는 20부터 b는 11보다 크거나 같을대까지 b는 1씩 감소
        *규칙성   : b를 출력
        *반복문 종료 후 : 없음
        */
		
		int b ;
		
		for(b = 20 ; b >= 11 ; b -= 1 ) {
			
		}
		/* 1부터 100까지 숫자 중 일의 자리가 3, 6, 9로 끝나는 수들을 출력하는
		 * 코드를 장성하세요. ( 3,6,9,13,16 ...)
		 */
		
		int c , num1 = 3, num2 = 6, num3 = 9;
		int k;
		
		
		for(c = 1, k = 0 ; c <= 100 ; c += 1 ) {
		  
			if (c % 10 == num1 ||  c % 10 == num2 || c % 10 == num3 ) {
				System.out.print(c + " ");
				k += 1;
				if ( k % 3 == 0) {
					System.out.println();
				}
			}
					  
		}
  
	}

}
