package Day4;

public class For14 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성
		 * 소수 : 약수가 2개인 수
		 * 소수 : 2 3 5 7 11 13 17 ...
		 * 반복횟수   : a는 1부터 a는 num보다 작거나 갈을때까지 a는 1씩 증가
		 * 규칙성    : a가 num의 약수이면 약수의 갯수 cnt를 1증가
		 * 반복문 종료 후 :
		 */
		
		int num = 4 , a , cnt = 0 ;
	    
		for(a = 1 ; a <= num ; a += 1) {
			
			if(num % a == 0 ) {
				cnt =+ 1;
			}
		}
		if(cnt == 2) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아님");
			
		}

	}

}
