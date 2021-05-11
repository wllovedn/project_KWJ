package Day11;

public class ConstructorOverloadingEx1 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(1,2);
		//A a3 = new A(1.0, 2); // 실수가 정수로 자동형변환이 안되기 때문에 에러
		A a4 = new A('a', 3); // 문자가 정수로 자동형변환이 되기 때문에 에러 X
		
	}
}
class A{
   private int num1;
   private int num2;
   public void A() {} // 생성자와 이름이 같은 메소드
   public A() {}
   public A(int num3, int num4) {
	   super();
	   this.num1 = num1;
	   this.num2 = num2;
   }
   
   public A(A a) {
	   num1 = a.num1;
	   num2 = a.num2;
	   
   }
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
   
  /* public A(double num10, double num11){
     }
     */

}
