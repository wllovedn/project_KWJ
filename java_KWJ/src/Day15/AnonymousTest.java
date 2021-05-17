package Day15;

public class AnonymousTest {

	public static void main(String[] args) {
		Remocon r = new Remocon() {
			@Override
			public void turnOn(){System.out.println("전원 켜짐");}
			@Override	
			public void turnOff() {System.out.println("전원 꺼짐");}
				
		};
		r.turnOn();
		}

	}



abstract class Parent{
	public abstract void print();
	
}
class Child extends Parent{
	@Override
	public void print() {
		System.out.println("안녕");
	}
}

class TempA{
	// private Prarent p = new Child();
	// Parent 추상 클래스를 이용하여 새로운 익명 객체를 생성한 후, 생선한 익명 객체의
	// 주소를 p와 저장
	private Parent p = new Child();
		int num = 10;
		public void print() {
			System.out.println("안녕");
		}
	};
	

interface Remocon{
	void turnOn();
	void turnOff();
	
}
class TvRemocon implements Remocon{
	public void turnOn() {System.out.println("전원 켜짐");}
	public void turnOff() {System.out.println("전원 꺼짐");}
	
}