package Day15;

//인터페이스의 다형성
public class PolymorphismTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.forntRight.roll();
		car.frontLeft.roll();
	}
	public static void repair(Tire tire) {
		if(tire instanceof HankookTire) {
			HankookTire t = (HankookTire)tire;
			System.out.println(t.company + "수리합니다.");
			System.out.println(((HankookTire)tire).company "수리합니다");
	}
		if(tire instanceof KumHoTire) {
			KumhoTire t = (KumhoTire)tire;
			System.out.println(t.company + :수리합니다);		
			System.out.println(((HankookTire)tire).company "수리합니다");
	}
}
class Car{
	Tire frontLeft = new KumhoTire();
	Tire forntRight = new HankookTire();
}
interface Tire{
	void roll(); // 바퀴가 구르는 기능
}
class KumhoTire implements Tire{
	String = company
	public void roll() {
		System.out.println("금호 타이어 굴러갑니다.");
	}
	
}
class HankookTire implements Tire{
	String = company
	public void roll() {
		System.out.println("한국 타이어 굴러갑니다.");
	}
	
}
