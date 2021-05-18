package Day16;

public class TryTest1 {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 0;
		/* 예외 발생시 catch에서 해당 예외 클래스나 조상 클래스가 있으면
		 * 예외를 처리한다
		 */
		try {
			System.out.println(num1 / num2);
		}catch(Exception e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램 종료");
		
		System.out.println("예외처리 1번 종료");
		
		try {
			System.out.println(num1 / num2);
		}catch(ArithmeticException e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다");
		}
		System.out.println("예외처리 2번 종료");
		
		try {
			System.out.println(num1 / num2);
		//RuntimeException은 Ar
		}catch(RuntimeException e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다");
		}
		System.out.println("예외처리 3번 종료");
		
		
		try {
			System.out.println(num1 / num2);
		}catch(ClassCastException e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다");
		}
		System.out.println("예외처리 4번 종료");
		
		System.out.println("프로그램 종료");

	}
}
