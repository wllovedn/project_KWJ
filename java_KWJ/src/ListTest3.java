import java.util.ArrayList;

public class ListTest3 {

	
	public static void main(String[] args) {
		/* 리스트에서 indexOf와 contains 메소드를 잘 활용하려면
		 * 해당 클래스에서 equals를 오버라이딩해야 한다.
		 */
		ArrayList<Student> list = new ArrayList<Student>();
		Student std1 = new Student(1,1,1,"홍길동");
		Student std2 = new Student(1,1,1,"홍길동");
		list.add(std1);
		System.out.println("리스트에 학생 정보가 있습니까? " + list.indexOf(std2));
		System.out.println("리스트에 학생 정보가 있습니까? " + list.contains(std2));
		
	}
}

class Student{
	int grade;
	int classNum;
	int num;
	String name;
	public Student(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + "]";
	}
	
}
