package Day6;

public class VariableEx1 {
	static int num = 10;//VariableEx1 클래스의 멤버변수 num
	public static void main(String[] args) {
        /* 지역변수 : 우리가 지금까지 사용한 일반 변수, 특정 지역에서만 사용 가능한 변수
         *   - 선언된 위치부터 해당 {}안 끝까지 사용가능
         * 멤버변수 : 클래스안에 있는 변수로, 해당 클래스의 모든 곳에서 사용 가능
         */
		//a는 11번째줄부터 21번째 줄까지 사용 가능,
		int a; // a는 main메소드 안에서 선언했기 때문에 선언 위치부터 amin메소드 끝까지 사용가능
		for (a=1 ; a<= 5; a += 1) {
			System.out.print("*");
		}
            System.out.println(a);
            //b는 17번째줄부터 18번째줄까지 사용가능
        for (int b=1; b<=5; b+=1 ) {//b는 반복문에서 선언했기 때문에 반복문에서만 사용 가능
        	System.out.print("*");
        }
            System.out.println();
            System.out.println(num);
	}
	
	public static void test( ) {
		//a = 10; //에로 발생 : test메소드에서는 a라는 변수를 선언하지 않았기 때문에
	}

}
