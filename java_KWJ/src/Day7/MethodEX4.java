package Day7;

public class MethodEX4 {
	/* gcd1은 재사용성이 높아서 최소 공배수 lcm을 구할 때 사용할 수 있지만
	 * gcd2는 재사용성이 낮아서 최소 공배수 lcm을 구할 때 사용할 수 없다.
	 */

	public static void main(String[] args) {
		//최대공약수를 이용하여 최소 공배수를 구하는 메소드를 작성하세요.
		//두 정수를 A, B라 하고 최대 공약수를 6, 최소 공배수를 L이라고 했을때
		//A = Ga, B=Gb로 표현할 수 있고, L = G*A*B
		System.out.println(gc1(8,12));
		gcd2(8,12);
	}
	
	/* 기능   : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 = > int num1, int num2
	 * 리턴타입 : 최대 공약수 => 정수 => int
	 * 메소드명 : gcd1
	 */

	public static void gcd2(int num1, int num2) {
		 int res = 1;
		 for(int a = 1 ; a<num1; a+=1) {
			  if(num % a == 0 && num2 % a == 0) {
				   res = a;
				   
			  }
		 }
	System.out.println(num1+"과 " + num2+"의 최대 공약수 : " + res);
	}
	
	/* 기능    : 두 정수의 최소 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최소 공배수 => 정수 => int
	 * 메소드명 : 1cm
	 */
	public static int lcm(int num1, int num2) {
		int res = num1 * num2 / gcd1(num1, num2);
		return res;
		
	}
	
}


