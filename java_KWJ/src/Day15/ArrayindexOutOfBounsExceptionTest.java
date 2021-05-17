package Day15;

public class ArrayindexOutOfBounsExceptionTest {

	public static void main(String[] args) {
		int [] arr = new int[5];
		for(int i = -1; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
