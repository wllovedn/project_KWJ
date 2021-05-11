package Board;

import java.util.Scanner;

public class BoardTest {
  private static String ;

public static void main(String[] args) {
	  /*다음 메뉴를 가지는 게시글 콘솔 프로그램을 만드세요.
	  1. 게시글 등록
	  2. 게시글 수정
	  3. 게시글 삭제
	  4. 게시글 목록 확인
	  5. 게시글 상세 확인
	  6. 프로그램 종료
	  */
	  Scanner scan = new Scanner(System.in);
	  System.out.println("게시판 메뉴를 확인하세요 : ");
	  
	  String Board = scan.next();
	  
			  
	  switch(Board) {
       case "1":
       	System.out.println("게시글 등록");
       case "2":
       	System.out.println("게시글 수정");
       case "3":
       	System.out.println("게시글 삭제");
       case "4":
       	System.out.println("게시글 목록 확인");
       case "5":
        System.out.println("게시글 상세 확인");
       case "6":
         System.out.println("종료.");
        break;
       for(int a = 1 ; a >= 7 ; a +=1) {
    	   
       }
		
		System.out.println("잘못된 메뉴 입니다" + );
	  }
  	
   }

}
