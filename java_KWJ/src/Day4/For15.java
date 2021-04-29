package Day4;

public class For15 {

	public static void main(String[] args) {
		/* 100이하의 모든 소수를 출력하는 코드를 작성
		 * 기존 소수 판별 예제에서 출력 부분을 수정
		 *  = > 소수이면 숫자를 출력하고 아니면 아무것도 안함
		 *  
		 */
		
        int num = 1 , a , cnt = 0;
	    
        for(num = 1 ; num <= 100; num += 1 ) {
        	cnt = 0;
        	for(a = 1 ; a <= num ; a += 1) {
    			if(num % a == 0) {
    				cnt += 1;
    				
    			}
    							
    		}
    		if(cnt == 2) {
    			System.out.print(num + " ");
    			
        }
		}
		
	}
		

}
