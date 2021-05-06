package day8;

public class Test8_5 {

	public static void main(String[] args) {
		/* 10개짜리 배열에 1부터 10를 저장한 후 출력하는 코드를 작성하세요
		 * 
		 */
		
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
	    for(int a = 0; a<arr1.length; a+=1) {
	    	arr1[a] = a + 1;
	    	System.out.print(arr1[a] + " ");
        }
	    int [] arr2 = new int[10];
	    arr2[0] = arr2[1] = 1;
	    for(int a = 2; a<arr2.length ; a += 1) {
	    	arr2[a] = arr2[a-2] + arr2[a-1];
	    	
	    }
	    
	    for(int a= 0 ; a<arr2.length; a += 1) {
	    	System.out.print(arr2[a] + " ");
	    	
	    }
	    /* 5개짜리 배열에 저장된 숫자들중 연속된 숫자가 3개인지 아닌지를
           확인하는 코드를작성하세요. 단, 숫자들은 정렬되었다고 가정
           예시 
           입력 : 1 1 2 3 4
           연속
           예시
           입력 : 1 2 4 5 8
           연속 아님
           예시 : 1 3 5 7 8
           연속
           뒤번지의 값과 1차이가 나면 count 변수를 1 증가,
           1차이가 나지 않으면 count를 1으로
           count가 3이되면(연속) 반복문 종료
           
           */
	    int [] arr3 = new int[] {1,3,5,6,7};
	    int count = 1; //연속된 숫자의 갯수
	    for(int a = 0; a<arr3.length - 1; a+=1 ) {
	    	//a번지의 값과 a+1번지의 값의 차이가 1이면 count를 1 증가
	    	if(arr3[a] + 1 == arr3[a+1]) {
	    		count += 1;
	    		
	    	}
	    	//아니면 count를 1로 초기화
	    	else {
	    		count = 1;
	    	}
	      	//count가 3이면 반복문 종료
	    	if(count == 3) {
	    		break;
	    	}
	    }
	    //count가 3이면 연속이라고 출력
	    if(count == 3) {
	    	System.out.println("연속");
	    }
	    
	    //count가 3이 아니면 연속 아님이라고 출력
	    else {
	    	System.out.println("연속 아님");
    }
  }
}
