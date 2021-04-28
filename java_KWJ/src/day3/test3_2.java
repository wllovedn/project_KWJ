package day3;

import java.util.Scanner;

public class test3_2 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 0, 양수, 음수인지 판별하는
		 * 코드를 장석하세요. */
		
		Scanner scan - new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("0")			
		} 
		else if(num > 0) {
			System.out.println("양수")
		}
		else if (num < 0) {
			System.out.println("음수")
		}
		
		scan.close();
		
		
		
	}

}
