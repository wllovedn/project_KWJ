package Board;

import java.util.Scanner;

public class Board {
	/* 다음 메뉴를 가지는 게시글 콘솔 프로그램을 만드세요.
       1. 게시글 등록
       2. 게시글 수정
       3. 게시글 삭제
       4. 게시글 목록 확인
	   5. 게시글 상세 확인
	   6. 프로그램 종료 */
	 
	private String A = "";
	private String B = "";
	private String C = "";
	private String D = "";
	private String E = "";
	
    
	
	

	

	public Board(String a, String b, String c, String d, String e, int x) {
		super();
		
		A = a;
		B = b;
		C = c;
		D = d;
		E = e;
	}
		
	public void print() {
		Scanner scan = new Scanner (System.in);
		System.out.println("게시글 등록" + A);
		System.out.println("게시글 수정" + B);
		System.out.println("게시글 삭제" + C);
		System.out.println("게시글 목록 확인" + D);
		System.out.println("게시글 상세 확인" + E);
		System.out.println("프로그램 종료" + X);
		
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getE() {
		return E;
	}
	public void setE(String e) {
		E = e;
			
	}
}
	

  
	