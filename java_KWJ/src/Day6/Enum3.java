package Day6;

import java.util.Calendar;

public class Enum3 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println(year + "년" + month + "월");
		
	}

}
