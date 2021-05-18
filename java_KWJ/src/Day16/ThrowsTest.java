package Day16;

public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	public static void test() throws Exception, ArithmeticException{
		throw new Exception("test 메소드에서 예외 발생");
	}

}
