package sec01.exam02;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);				//studentNo밑에다 super를 쓰면 안됨 부모클래스를 먼저 가져와야 하기 때문에 실행이 안됨, ()안쪽에 비워서도 안됨 ()메소드를 만들지 않았기 때문에
		this.studentNo = studentNo;
	}
}