package Day7;

public class MethodEx6 {

	public static void main(String[] args) {
		
		
		
		/* 다음과 같이 출력하는 메소드를 만드세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		/* 다음과 같이 출력하는 메소드를 만드세요
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****    
		 */
		
		pirntLeftTriangLe('+',6);
		pirntReftTriangLe('+',6);
		pirntTriangLe('+',5, TriangLeShape.LEFT_T('+',6););
		pirntLeftTriangLe('+',6);
		// char ch count
		
		}
		
	/* 기능    : 주어진 문자를 이용하여 왼쪽으로 붙은 삼각형을 출력하는 메소드
	 * 매개변수 : 문자, n줄 => char ch, int n
	 * 리턴타입 : 없음 => void
	 * 메소드명 : mh
	 */
	public static void mh1(char ch, int n ){
		int a;
		int s;
		for (a = 1; a <= n ; a+= 1) {
			for(s = 1; s <= a ; s+= 1)
			System.out.println(ch);
		}
	    System.out.println( );
	
	}
	public static void mh2(char ch, int count ){
		int a;
		int s;
		for (a = 0; s <  ; a- 1) {
			System.out.print(ch);
		}
		System.out.println( );
   }
	/* 기능    : 주어진 문자를 이용하여 n줄 삼각형 출력하는데 주어진 삼각혀 종류에 맞게 
	 *       출력하는 메소드
	 * 매개변수 : 문자, n줄, 삼각형 종류 => char ch, int n, ??
	 * 리턴타입 : void
     * 메소드명 : printTriangle*/
	public static void printTriangle(char ch, int n, TrianglcShpe) {
		swch (shape){
			case LEFT_TRIANGLE:
				printLeftTriangle(ch, n);
				break;
			case RIGHT_TRIANGE
		    
		}
	}
}


enum TriangleShape {LEFT_TRIANGLE, RIGHT_TRIANGLE}
