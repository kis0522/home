package sec02.exam06;

public class InstanceofExample {
	public static void method1(Parent parent) {		//var Parent parent = Parent parentA
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");			
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();	//자동형변환
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	//자동형변환
		method1(parentB);
		//method2(parentB);				//예외 발생
	}
}