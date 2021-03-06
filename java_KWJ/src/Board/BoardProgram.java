package Board;

import java.util.Scanner;

public class BoardProgram {
	private Board []board;
	private Scanner scan;
	private int count; // count = 0; 이라고 써도됨
	
	public BoardProgram() {
		//board = new Board[max];
		//scan = new Scanner(System.in);
		this(10);
	}
	public BoardProgram(int max) {
		if(max <= 10) {
			max = 10;
		}
		board = new Board[max];
		scan = new Scanner(System.in);
	}
	/*  기능   : 게시글을 추가하는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : insertBoard
	 */
	public void insertBoard() {
		System.out.println("게시글 정보를 입력하세요.");
		System.out.print("제목 : ");
		String title = scan.next();
		System.out.print("작성자 : ");
		String writer = scan.next();
		System.out.print("작성일 : ");
		String registerDate = scan.next();
		System.out.print("내용 : ");
		String content = scan.next();
     
		String type = "게시글";
		int num = count + 1;
		Board tmpBoard = new Board(num, title, content, writer, registerDate, type);
		board[count] = tmpBoard;
		count += 1;
	}
	/* 기능    : 게시글 번호를 입력받아 입력받은 게시글을 확인하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : printBoardDetail
	 */
	public void printBoardDetail() {
		System.out.println("확인할 게시글의 번호를 입력하세요 : ");
		int num = scan.nextInt();
		if(num <= count && board[num-1] != null) {
			board[num-1].print();
		}else {
			System.out.println("해당 게시글이 없거나 삭제되었습니다.");
		}
    }
	/* 기능    : 게시글 전체를 확인하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 
	 * 메소드명 : printBoardList
	 */
	public void printBoardList() {
		for(int i = 0 ; i<count; i+=1) {
			if(board[i] != null) {
				board[i].summaryPrint();
			}
		}	
	}
	/* 기능    :수정할 게시글번호와 정보를 입력받아 수정하는 메소드
	 * 매개변수 :없음
	 * 리턴타입 :없음
	 * 메소드명 :modifyBoard
	 */
	public void modifyBoard(){
		System.out.print("수정할 게시글 번호를 입력하세요 : ");
		int num = scan.nextInt();
		if(num <= count && board[num-1] != null){
			System.out.println("제목 : ");
			String title = scan.next();
			System.out.println("내용 : ");
			String content = scan.next();
			board[num-1].modify(title, content);
				
		}else {
			System.out.println("수정할 게시글이 없습니다.");
		}	
	}
	/* 기능    : 게시글 번호를입력받아 삭제하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : deleteBoard
	 */
	public void deleteBoard() {
		System.out.print("삭제할 게시글 번호를 입력하세요 : ");
		int num = scan.nextInt();
		if(num <= count) {
			board[num - 1] = null;
		}
	}
	/* 기능    : 게시글 프로그램을 종료하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 
	 * 메소드명 : closeBoard
	 */
	public void closeBoard() {
		System.out.println("프로그램 종료합니다.");
		scan.close();
	}
}
