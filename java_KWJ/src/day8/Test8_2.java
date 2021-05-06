package day8;

import java.util.Scanner;

public class Test8_2 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 작성하세요.
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abcdefg...xyz
		 */
		for(char a = 'a'; a <= 'z' ; a += 1) {
			for(char s = 'a'; s <= a; s += 1) {
				System.out.print(s);
				
			}
		     System.out.println();
		}
		String str = "";
		for(char a = 'a' ; a <= 'z' ; a += 1) {
			 str += a;
			System.out.println(str);
		}
     }
}
		
		
			
