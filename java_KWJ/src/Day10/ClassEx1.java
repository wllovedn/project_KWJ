package Day10;

public class ClassEx1 {

	public static void main(String[] args) {
		A a = new A(); // public d
		a.num = 10;
		B b = new B();
		//protected : 클래스 B와 ClassEx1은 같은 패키지에 있기 때문에 에러 발생하지 않음
		b.num = 10;
		C c = new C();
		c.num = 10;
		//디폴트 : 클래스 C와 ClassEx1은 같은 패키지에 있기 때문에 에러 발생하지 않음
		D d = new D();
		//d.num = 10; //에러발생 : num의 접근제한자가 private이어서
	}

}

