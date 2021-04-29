package Day4;

public class For13 {

	public static void main(String[] args) {
		/* 구구단 전체를 출력하는 코드를 작성하세요.
		 * 
		 */
		
		int num = 2, a;
		
		for(num = 2 ; num <= 9 ; num += 1) {
			
		for (a = 1 ; a <= 9 ; a+= 1) {
			System.out.println(num + " x " + a + " = " +  num * a);
			
		   }
			
			
		}
			

	}

}
