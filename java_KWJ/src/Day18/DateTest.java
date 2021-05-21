package Day18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//현재실력을 출력
		//현재ㅐ시간을 원하는 형태로 문자열로 변경(Date = String)
		SimpleDateFormat form = new SimpleDateForamt(yyyy - MM - dd HH:L mm: ss);
		String str = form.format(date);
		System.out.println(str);
		
		//시간 표현으로 된 문자열을 시간 객체를 변경(String=Date)
		String str = 2021-50-21 09:50:55
		System.out.println("예약 정보를 입력하세요");
		System.out.print("입실일(yyyy년MM월dd일 : ");
		Scanner scan = new Scanner(System.in);
		String startDate = scan.next();
		System.out.println("퇴실일(yyyy년MM월DD일) : ");
		String endDate = scan.next();
		Hotel hotel = new Hotel();
		hotel.setEndDate(endDate);
		hotel.setStartDate(startDate);
		System.out.println(hotel);
		scan.close();
		
		
				
				
	}

}
class Hotel{
	//입실일
	Date startDate;
	//퇴실일
	Date endDate;
	@Override
	public String toString() {
		return "Hotel [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
}