package Day4;

public class For8 {

	public static void main(String[] args) {
		/* a부터 z까지 출력하는 코드를 작성하세요.
		 * 반복횟수  :  a는 0부터 a는 26보다 작을때까지
		 *            a는 1씩 증가
		 * 규칙성   : 
		 */
	 int a;
	 
		for(a = 0 ; a < 26 ; a += 1) {
		 System.out.print((char) ('a'+ a) + " ");
		 
		 
	 }
	 /* 반복횟수   : ch는 'a' 부터 ch는 'z' 까지 ch는 1씩증가
	  * 규칙성     : ch를 출력
	  * 반복문 종료 후 : 없음
	  */
		
		char ch;
		for(ch = 'a' ; ch <= 'z' ; ch += 1) {
			System.out.print(ch + " ");
		}
	
	}

}
