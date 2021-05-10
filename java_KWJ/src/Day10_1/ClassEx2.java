package Day10_1;

import Day10.A;
import Day10.B;
import Day10.C;
import Day10.D;
import Day10.ClassEx1; //day10패키지에 있는 클래스 ClassEx1을 가져오려 한다.



public class ClassEx2 {

	public static void main(String[] args) {
		A a = new A(); // public이기 때문에 에러가 발생하지 않음
		a.num = 10;
		B b = new B();
		//protected : 클래스 B와 ClassEx1은 같은 패키지에 있기 때문에 에러 발생하지 않음
		//b.num = 10;
		C c = new C();
		//c.num = 10;
		//디폴트 : 클래스 C와 ClassEx1은 같은 패키지에 있기 때문에 에러 발생하지 않음
		D d = new D();
		//d.num = 10; //에러발생 : num의 접근제한자가 private이어서

	}

}
