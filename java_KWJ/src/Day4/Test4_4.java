package Day4;

import java.util.Scanner;

public class Test4_4 {

	public static void main(String[] args) {
		//
		
		int min = 1, max = 25;
		//Math.random()은 0보다 크거나 같고 1보다 작은 임의의 실수를 생성하는 기능
		/* Math.random() : A
		 * 0 <= A < 1
		 * 0 * (max - min + 1) <= A * (max - min + 1) < 1 * (max - min + 1)
		 * 0 <= A * (max - min + 1) < max - min + 1
		 * min <= A * (max - min + 1) + min < max + 1		 
		 */
		int r = (int)(Math.random() * (max - min + 1) + min);
		/* 정수를 랜덤으로 생성하여 생성된 숫자를 맞추는 게임
		 * 예시 (랜덤하게 생성된 숫자가 25인 경우)
		 * 정수가 랜덤으로 생성되었습니다. 게임 시작!!!!
		 * 정수를 입력하세요 : 100
		 * Down 
		 * 정수를 입력하세요 : 40
		 * Down
		 * 정수를 입력하세요 : 10
		 * UP
		 * 정수를 입력하세요 : 20
		 * UP
		 * 정수를 입력하세요 : 25
		 * 정답입니다.
		 * 반복횟수 :  x
		 * 규칙성  : 정수를 입력하세요라는 문자열 출력
		 *         콘솔에서 정수를 입력 받음
		 *         입력받은 정수가 랜던한 수보다 크면 down이라고 출력하고
		 *         작으면 up이라고 출력하고
		 *         같으면 정답입니다라고 출력 후 종료.
		 * 
		 */
		 int num  ;
		 Scanner scan = new Scanner(System.in);
	 		
	 		
	     for(; ;) {
	    	
	    	 System.out.println("정수를 입력하세요("+min + "~" +max+ ") : ");
	    	 num = scan.nextInt();
	    	 if(num > r) {
	    		 System.out.println("down");
	    	 }
	    	 else if(num < r) {
	    		 System.out.println("UP");
	    	 }
	         if(num == r) {
	        	 System.out.println("정답입니다");
	        	 break;
	         }
	     }
			
	}

}
