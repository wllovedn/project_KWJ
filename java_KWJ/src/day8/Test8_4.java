package day8;

public class Test8_4 {

	public static void main(String[] args) {
		/* - 1부터 10까지 한줄로 출력되는 코드를 작성하세요.
		 * - 다음과 같이 되도록 코드를 작성하세요.
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10
		 */
		
			int = a;
		for(a=1; a<=12; a+= 1) {
			System.out.print(a);
			if(a % 4 == 0) {
			 System.out.println();
			}else {
			  System.out.print(",");
		  }
			//String str = 1%4 == 0 ? "\n" : ",";
			//System.out.print(str);
	   }
		/* 다음과 같이 출력되도록 코드를 작성하세요.
		 * 2 1 4 3
		 * 6 5 8 7
		 * 10 9 12 11
		 */
		for(int a = 1; a <= 12; a+=1) {
		
		  if( 1 % 2 == 1) {
			  System.out.println(a + 1 + " ");
		  }else {
			  System.out.println(a - 1 + " ");
		  }
		  if( a % 4 == 0) {
			  System.out.println();
			  
			  
		    
			
			
			
			}
			
		
		}
		
    }
}





