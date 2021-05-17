package Day15;

public class classcastExceptionTest {

	public static void main(String[] args) {
		Figure f1 = new Rect();
		Figure f2 = new Figure();
		//클래스 타입 변환이 불가능하여 예외 발생
		//Rect r2 = (Rect)f2;
		//조건문과 instanceof를 이용한 예외 방지
		if(f2 instanceof Rect) {
			Rect r2 = (Rect)f2;
			System.out.println("타입 변환 성공");
		}

	}

}
class Figure{}
class Rect extends Figure{}
