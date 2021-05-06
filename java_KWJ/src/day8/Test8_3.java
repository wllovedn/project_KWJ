package day8;

import java.util.Scanner;

public class Test8_3 {

	public static void main(String[] args) {
		/*4개의 성적을 입력받아 합격인지 불합격인지 판별하는 코드를 작성하세요.
		 * 합격 기준
		 *  - 모든 성적이 과락이 없어야함
		 *  - 평균 60점 이상
		 * 과락 : 성적이 40점 미만인 경우
		 * 예시
		 * 성적 : 40 30 100 100
		 * 불합격입니다.
		 * 성적 : 60 40 100 100 
		 * 합격입니다
		 * 성적 40 50 40 60
		 * 불합격입니다*/
		
	  int []score = new int[4];
	  Scanner scan = new Scanner(System.in);
	  for(int a=0 ; a<score.length ; a+=1 ) {
		  score[a] = scan.nextInt();
		  
		  
	  }
	  scan.close();
	  
	  int sum = 0;
	  boolean pass = true; //false : 불합격, true : 합격
	  for(int tmp : score ) {
		  sum += tmp;
	  }  
	  double avg = (double)sum / score.length;
	  if(avg < 60) {
		  pass = false;
		  
	  }
	  
	  for(int tmp : score) {
		  if(tmp < 40) {
			  pass = false;
			  
		  }
	  }
	  if(pass) {
		  System.out.println("합격입니다.");
	  }else {
		  System.out.println("불합격입니다.");
	  }
	}
}