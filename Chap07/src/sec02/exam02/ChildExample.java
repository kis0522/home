package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;			//자동형변환
		parent.method1();
		parent.method2();				//재정의한게 실행된다. (자식)
		//parent.method3(); (형변환 한 상태 여서 호출 불가능)
		
		Child child2 = (Child)parent;	//강제형변환
		child2.method3();
	}
}