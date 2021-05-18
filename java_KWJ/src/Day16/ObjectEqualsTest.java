package Day16;

public class ObjectEqualsTest {

	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = str1;
		System.out.println(str1 = str2);
		System.out.println("두 문자열 주소 비교 : " + (str1 == str2));
		System.out.println("str2 = new String(\"abcd\")");
		str2 = new String("abcd");
		System.out.println("두 문자열 주소 비교 : " + (str1 == str2));
		System.out.println("두 문자열 비교 : " + str1.equals(str2));

		Num n1 = new Num();
		Num n2 = new Num();
		System.out.println("n1과 n2 주소 비교 : " + (n1 == n2));
		System.out.println("n1과 n2가 같다 : " + (n1 == n2));
		
		n1.equals(n2);
		n1.equals("abc");
	}

}
class Num{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		//매개변수 obj를 Num클래스의 객체로 타입변환이 가능하지 않다면
		//false를 리턴: 다른 클래스의 객체와 비교할 필요가 없어서
		if(! (obj instanceof Num)) {
			return false;
		}
		//매개변수의 num와 내 num가 같은지를 비교
		Num tmp = (Num)obj;
		if(num == tmp.num) {
			return true;
	    }
		return false;
	}
	@Override
	public int hashCode{}

}
	
