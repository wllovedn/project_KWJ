package Day10;

import java.util.Scanner;

public class ClassEx5 {

	public static void main(String[] args) {
		/* Circle 클래스를 이용하여 원 객체를 생성한 후 테스트 하는 예제 */
		Circle c1 = new Circle();
		c1.print();
		//중심점을 5,5로 이동
		c1.move(5, 5);
		//반지름 길이 변경 5로
		c1.setRadius(5);
		c1.print();
		//Scanner라는 클래스를 이용하여 scan 객체를 선언하고,
		//Scanner(System.in) 생성자를 이용하여 객체를 생성
		Scanner scan = new Scanner(System.in);
		scan.close();
		
	    public int getX() {
	    	return x;
	    }
		
		public void setX(int x) {
			this.x = x;
		}	
			
		public int getY() {
			return y;
		}	
		
		public void setY(int y) {
			this.y = y;
		}
		/*초기 x,y좌표가 x1,y1주어지면 주어진 x,y좌표로 멤버변수를 초기화하는 생성자*/
		public Point(int x1, int y1) {
			x = x1;
			y = y1;
			
		}
		public Point() {
			
		}
    }
}

