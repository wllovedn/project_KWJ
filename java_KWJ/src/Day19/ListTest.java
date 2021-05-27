package Day19;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕");
		list.add("HI");
		list.add("HELLO");
		for(String tmp : list) {
			System.out.println(tmp);
		}
	}

}
