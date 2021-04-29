package Day4;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int a;
	   for(a=1; a<=5 ; a+=1 ) {
		   System.out.println("미영짱");
		   
		   //if문 없이 break가 나오면 반복문을 쓴 의미가 없어진다.
		   break;
	   }
	   
	   for(a=1 ; ; a+= 1) {
		  
		   System.out.println(a);
		   if( a == 5) {
			   break;
		   }
	   }
	  char ch;
	  Scanner scan = new Scanner(System.in);
	  
		  
	 for( ; ; ) {
	     System.out.println("문자를 입력하세요(종료하려면 q/Q 입력)  : ") ;
	     ch = scan.next().charAt(0);
	     if(ch == 'q' || ch == 'Q') {
	    	 break;
	    	 
	     }
	 }
	   
	  
		scan.close();
		
		  
	  }
	}
	

