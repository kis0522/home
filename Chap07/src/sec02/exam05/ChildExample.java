package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();		//자동형변환 - 자식클래스를 부모클래스에 넣어 자동으로 형 변환함
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

/*		parent.field2 = "data2";
		parent.method3();
*/		
		Child child = (Child) parent;		//강제형변환 - 부모클래스를 자식클래스로 강제로 변환
		child.field2 = "data2";
		child.method3();
	}
}