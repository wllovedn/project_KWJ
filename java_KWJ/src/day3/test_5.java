package day3;

import java.util.Scanner;

public class test_5 {

	public static void main(String[] args) {
		/* 월의 마지막일수를 출력하는 예제를 switch문으로 작성하세요.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */

		Scanner scan = new Scanner(System.in);
		
		int month = 5;
		
		switch(month) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		case 4 : case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		default:
		    System.out.println(month+"월은 올바른 달이 아닙니다.");
				
		
	
		
		
		
		scan.close();
		
		}
		
	}


