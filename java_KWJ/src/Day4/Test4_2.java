package Day4;

public class Test4_2 {

	public static void main(String[] args) {
		/* 1부터 10까지의 짝수들을 continue를 이용하여 출력
		 * 
		 */
		
		int a ; 
		for (a = 1 ; a <= 10 ; a += 1) {
			if(a % 2 != 0 ) {
				continue;
			}
			
			System.out.println(a);
			
		}
	}

}
