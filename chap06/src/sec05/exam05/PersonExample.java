package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";	//final 선언으로 인해 변경할수 없는 상태 + 생성될때 입력 가능
		p1.name = "홍삼원";
	}
}